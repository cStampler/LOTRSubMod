package me.stampler.numenors.itemgroups;

import me.stampler.numenors.regs.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class NumenorItemGroup extends ItemGroup {

    public static final NumenorItemGroup NUMENOR_ITEM_GROUP = new NumenorItemGroup(ItemGroup.TABS.length,
            "numenor");


    public NumenorItemGroup(int index, String label) {
        super(index, label);
    }

    public ItemStack makeIcon() {
        return new ItemStack(ModItems.NUMENOR_PICKAXE.get());
    }



    static void register() {}
}

