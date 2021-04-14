package me.stampler.numenors.regs;

import me.stampler.numenors.NumenorMod;
import me.stampler.numenors.itemgroups.NumenorItemGroup;
import me.stampler.numenors.specialitems.Wrench;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NumenorMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NumenorMod.MOD_ID);
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, NumenorMod.MOD_ID);
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, NumenorMod.MOD_ID);


    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        BIOMES.register(modEventBus);
        ENTITY_TYPES.register(modEventBus);

        ModItems.register();
        ModBlocks.register();


    }
    public static final RegistryObject<Item> WRENCH_ITEM = ITEMS.register("numenor_wrench", () -> new Wrench(new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP)));
}