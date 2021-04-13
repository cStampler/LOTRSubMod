package me.stampler.numenors.regs;

import me.stampler.numenors.itemgroups.NumenorItemGroup;
import me.stampler.numenors.itemgroups.NumenorLoreGroup;
import me.stampler.numenors.tiers.NumenorArmorTier;
import me.stampler.numenors.tiers.NumenorItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    // Numenor Items
    public static final RegistryObject<Item> NUMENOR_INGOT = Registration.ITEMS.register("numenor_ingot", () ->
            new Item(new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP)));

    public static final RegistryObject<Item> BLACKNUMENOR_INGOT = Registration.ITEMS.register("blacknumenor_ingot", () ->
            new Item(new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP)));

    public static final RegistryObject<Item> NUMENOR_RING = Registration.ITEMS.register("numenor_ring", () ->
            new Item(new Item.Properties().tab(NumenorLoreGroup.NUMENOR_LORE)));
    // Numenor Tools

    public static final RegistryObject<ToolItem> NUMENOR_PICKAXE = Registration.ITEMS.register("numenor_pickaxe", () ->
            new PickaxeItem(NumenorItemTier.NUMENOR, 1, -2.8F, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(500))));

   public static final RegistryObject<Item> NUMENOR_AXE = Registration.ITEMS.register("numenor_axe", () ->
          new AxeItem(ItemTier.STONE, 6.0F, -3.1F, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(500))));

    public static final RegistryObject<Item> NUMENOR_SWORD = Registration.ITEMS.register("numenor_sword", () ->
           new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(500)));

    public static final RegistryObject<Item> NUMENOR_SHOVEL = Registration.ITEMS.register("numenor_shovel", () ->
            new ShovelItem(NumenorItemTier.NUMENOR, 1, -2.8F, (new Item.Properties()).tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(500)));

    public static final RegistryObject<Item> NUMENOR_BATTLEAXE = Registration.ITEMS.register("numenor_battleaxe", () ->
            new AxeItem(NumenorItemTier.NUMENORAXE, 6.0F, -3.3F, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP)).defaultDurability(500)));
    //
    //
    //
    // Numenor Armors
    public static final RegistryObject<Item> NUMENOR_HELMET = Registration.ITEMS.register("numenor_helmet", () ->
            new ArmorItem(NumenorArmorTier.NUMENORHELM, EquipmentSlotType.HEAD, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> NUMENOR_CHESTPLATE = Registration.ITEMS.register("numenor_chestplate", () ->
            new ArmorItem(NumenorArmorTier.NUMENORAR, EquipmentSlotType.CHEST, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> NUMENOR_LEGGINGS = Registration.ITEMS.register("numenor_leggings", () ->
            new ArmorItem(NumenorArmorTier.NUMENORAR, EquipmentSlotType.LEGS, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> NUMENOR_BOOTS = Registration.ITEMS.register("numenor_boots", () ->
            new ArmorItem(NumenorArmorTier.NUMENORAR, EquipmentSlotType.FEET, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> UNNUMENOR_HELMET = Registration.ITEMS.register("unnumenor_helmet", () ->
            new ArmorItem(NumenorArmorTier.NUMENORUNFAITHHELM, EquipmentSlotType.HEAD, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> UNNUMENOR_CHESTPLATE = Registration.ITEMS.register("unnumenor_chestplate", () ->
            new ArmorItem(NumenorArmorTier.NUMENORUNFAITH, EquipmentSlotType.CHEST, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> UNNUMENOR_LEGGINGS = Registration.ITEMS.register("unnumenor_leggings", () ->
            new ArmorItem(NumenorArmorTier.NUMENORUNFAITH, EquipmentSlotType.LEGS, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> UNNUMENOR_BOOTS = Registration.ITEMS.register("unnumenor_boots", () ->
            new ArmorItem(NumenorArmorTier.NUMENORUNFAITH, EquipmentSlotType.FEET, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));
// Ar Pharazon/ LORE ITEMS
    //
    //
    //
    public static final RegistryObject<Item> ARPHARAZON_BOOTS = Registration.ITEMS.register("arpharazon_boots", () ->
            new ArmorItem(NumenorArmorTier.ARPHARAZON, EquipmentSlotType.FEET, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> ARPHARAZON_LEGGINGS = Registration.ITEMS.register("arpharazon_leggings", () ->
            new ArmorItem(NumenorArmorTier.ARPHARAZON, EquipmentSlotType.LEGS, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> ARPHARAZON_CHESTPLATE = Registration.ITEMS.register("arpharazon_chestplate", () ->
            new ArmorItem(NumenorArmorTier.ARPHARAZON, EquipmentSlotType.CHEST, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));

    public static final RegistryObject<Item> ARPHARAZON_HELMET = Registration.ITEMS.register("arpharazon_helmet", () ->
            new ArmorItem(NumenorArmorTier.ARPHARAZON, EquipmentSlotType.HEAD, (new Item.Properties().tab(NumenorItemGroup.NUMENOR_ITEM_GROUP).defaultDurability(765))));
//
// Lore Weapons
public static final RegistryObject<Item> ANGRIST = Registration.ITEMS.register("weapon_angrist", () ->
        new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> ANGUIREL = Registration.ITEMS.register("weapon_anguirel", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> ARANRUTH = Registration.ITEMS.register("weapon_aranruth", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> AZOG = Registration.ITEMS.register("weapon_azog", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> BALIN = Registration.ITEMS.register("weapon_balin", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> BARAZANTHUAL = Registration.ITEMS.register("weapon_barazanthual", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> BOROMIR = Registration.ITEMS.register("weapon_boromir", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> DAGMOR = Registration.ITEMS.register("weapon_dagmor", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item>DAIN = Registration.ITEMS.register("weapon_dain", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> DORI = Registration.ITEMS.register("weapon_dori", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> DRAMBORLEG = Registration.ITEMS.register("weapon_dramborleg", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> DURIN = Registration.ITEMS.register("weapon_durin", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> DWALIN = Registration.ITEMS.register("weapon_dwalin", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> EOWYN = Registration.ITEMS.register("weapon_eowyn", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> GIMLI = Registration.ITEMS.register("weapon_gimli", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> GURTHANG = Registration.ITEMS.register("weapon_gurthang", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> GUTHWINE = Registration.ITEMS.register("weapon_guthwine", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> HERUGRIM = Registration.ITEMS.register("weapon_herugrim", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> KILI = Registration.ITEMS.register("weapon_kili", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> LEGOLAS = Registration.ITEMS.register("weapon_legolas", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> MELKOR = Registration.ITEMS.register("weapon_melkor", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> THORIN = Registration.ITEMS.register("weapon_thorin", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> THRAIN = Registration.ITEMS.register("weapon_thrain", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> THROR = Registration.ITEMS.register("weapon_thror", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));

    public static final RegistryObject<Item> URFAEL = Registration.ITEMS.register("weapon_urfael", () ->
            new SwordItem(NumenorItemTier.NUMENOR, 3, -2.4F, (new Item.Properties()).tab(NumenorLoreGroup.NUMENOR_LORE).defaultDurability(500)));



    static void register() {}
}
