package me.stampler.numenors.itemgroups;

import me.stampler.numenors.regs.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class NumenorLoreGroup extends ItemGroup
{
    public static final NumenorLoreGroup NUMENOR_LORE = new NumenorLoreGroup(ItemGroup.TABS.length,
            "numenorlore");

    public NumenorLoreGroup(int index, String label) {
        super(index, label);
    }

    public ItemStack makeIcon() {
        return new ItemStack(ModItems.NUMENOR_RING.get());
}
}

