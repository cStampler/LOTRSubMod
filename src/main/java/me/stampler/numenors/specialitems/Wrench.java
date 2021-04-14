package me.stampler.numenors.specialitems;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import net.minecraft.block.BlockState;
import net.minecraft.block.DirectionalBlock;
import net.minecraft.block.FurnaceBlock;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.Property;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Wrench extends Item {
    public Wrench(Item.Properties properties) {
        super(properties);
    }

    private List<Direction> getRotationOrder(Direction clickedFace, Boolean alternativeRotation, Direction playerFacingDirection) {
        if(alternativeRotation) {
            return Arrays.asList(clickedFace, clickedFace.getOpposite());
        } else if(Arrays.asList(Direction.DOWN, Direction.UP).contains(clickedFace)) {
            return Arrays.asList(playerFacingDirection, playerFacingDirection.getClockWise(), playerFacingDirection.getOpposite(), playerFacingDirection.getCounterClockWise());
        } else {
            return Arrays.asList(Direction.UP, clickedFace.getClockWise(), Direction.DOWN, clickedFace.getCounterClockWise());
        }
    }

    private Direction getNextFacingValue(Direction clickedFace, Direction currentFacingValue, Direction playerFacingDirection,
                                         Collection<Direction> possibleDirections, Boolean alternativeRotation) {
        List<Direction> rotationOrder = getRotationOrder(clickedFace, alternativeRotation, playerFacingDirection);
        List<Direction> filteredRotationOrder = rotationOrder.stream().distinct().filter(possibleDirections::contains).collect(Collectors.toList());

        if(filteredRotationOrder.size() == 0) {
            return currentFacingValue;
        }

        int nextRotationIndex = filteredRotationOrder.contains(currentFacingValue) ? (filteredRotationOrder.indexOf(currentFacingValue) + 1) % filteredRotationOrder.size() : 0;
        return filteredRotationOrder.get(nextRotationIndex);
    }

    private BlockState rotateBlock(BlockState blockState, Direction clickedFace, Direction playerFacingDirection, boolean isSneaking, DirectionProperty property) {
        Direction facingDirection = blockState.getValue(property);
        Collection<Direction> possibleDirections = property.getPossibleValues();
        return blockState.setValue(property,
                getNextFacingValue(clickedFace, facingDirection, playerFacingDirection, possibleDirections, isSneaking));

    }

    @Override
    public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext ctx) {
        final World world = ctx.getLevel();
        final BlockPos pos = ctx.getClickedPos();
        final BlockState blockState = world.getBlockState(pos);
        final Boolean isSneaking = ctx.isSecondaryUseActive();
        final Direction playerFacingDirection = ctx.getPlayer().getDirection();
        Direction clickedFace = ctx.getClickedFace();
        BlockState newBlockState = null;

        for (Property<?> property : blockState.getProperties()) {
            if(property == BlockStateProperties.HORIZONTAL_FACING) {
                newBlockState = rotateBlock(blockState, clickedFace, playerFacingDirection, isSneaking, BlockStateProperties.HORIZONTAL_FACING);
            }
            if(property == BlockStateProperties.FACING) {
                newBlockState = rotateBlock(blockState, clickedFace, playerFacingDirection, isSneaking, BlockStateProperties.FACING);
            }
        }

        if (newBlockState != null) {
            world.setBlockAndUpdate(pos, newBlockState);
            return ActionResultType.SUCCESS;
        }
        return super.onItemUseFirst(stack, ctx);
    }
}