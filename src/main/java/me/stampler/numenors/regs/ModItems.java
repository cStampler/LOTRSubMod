package me.stampler.numenors.regs;

import me.stampler.numenors.itemgroups.NumenorItemGroup;
import me.stampler.numenors.tiers.NumenorArmorTier;
import me.stampler.numenors.tiers.NumenorItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> NUMENOR_INGOT = Registration.ITEMS.register("numenor_ingot", () ->
            new Item(new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP)));

    public static final RegistryObject<ToolItem> NUMENOR_PICKAXE = Registration.ITEMS.register("numenor_pickaxe", () ->
            new PickaxeItem(NumenorItemTier.NUMENOR, 1, -2.8F, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(500))));

   public static final RegistryObject<Item> NUMENOR_AXE = Registration.ITEMS.register("numenor_axe", () ->
          new AxeItem(ItemTier.STONE, 6.0F, -3.1F, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(500))));

    public static final RegistryObject<Item> NUMENOR_SWORD = Registration.ITEMS.register("numenor_sword", () ->
           new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(500)));

    public static final RegistryObject<Item> NUMENOR_SHOVEL = Registration.ITEMS.register("numenor_shovel", () ->
            new ShovelItem(NumenorItemTier.NUMENOR, 1, -2.8F, (new Item.Properties()).tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(500)));

    public static final RegistryObject<Item> NUMENOR_HELMET = Registration.ITEMS.register("numenor_helmet", () ->
            new ArmorItem(NumenorArmorTier.NUMENORHELM, EquipmentSlotType.HEAD, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> NUMENOR_CHESTPLATE = Registration.ITEMS.register("numenor_chestplate", () ->
            new ArmorItem(NumenorArmorTier.NUMENORAR, EquipmentSlotType.CHEST, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> NUMENOR_LEGGINGS = Registration.ITEMS.register("numenor_leggings", () ->
            new ArmorItem(NumenorArmorTier.NUMENORAR, EquipmentSlotType.LEGS, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> NUMENOR_BOOTS = Registration.ITEMS.register("numenor_boots", () ->
            new ArmorItem(NumenorArmorTier.NUMENORAR, EquipmentSlotType.FEET, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> NUMENOR_BATTLEAXE = Registration.ITEMS.register("numenor_battleaxe", () ->
            new AxeItem(NumenorItemTier.NUMENORAXE, 6.0F, -3.3F, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP)).defaultDurability(500)));

    public static final RegistryObject<Item> UNNUMENOR_HELMET = Registration.ITEMS.register("unnumenor_helmet", () ->
            new ArmorItem(NumenorArmorTier.NUMENORUNFAITHHELM, EquipmentSlotType.HEAD, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> UNNUMENOR_CHESTPLATE = Registration.ITEMS.register("unnumenor_chestplate", () ->
            new ArmorItem(NumenorArmorTier.NUMENORUNFAITH, EquipmentSlotType.CHEST, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> UNNUMENOR_LEGGINGS = Registration.ITEMS.register("unnumenor_leggings", () ->
            new ArmorItem(NumenorArmorTier.NUMENORUNFAITH, EquipmentSlotType.LEGS, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> UNNUMENOR_BOOTS = Registration.ITEMS.register("unnumenor_boots", () ->
            new ArmorItem(NumenorArmorTier.NUMENORUNFAITH, EquipmentSlotType.FEET, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));





    static void register() {}
}
