package net.saifa.quackems_the_end_update_mod.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.item.custom.AmoriteDetectorItem;
import net.saifa.quackems_the_end_update_mod.item.custom.FuelItem;
import net.saifa.quackems_the_end_update_mod.item.custom.MetalDetectorItem;
import net.saifa.quackems_the_end_update_mod.item.custom.ModArmorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Quackems_The_End_Update.MOD_ID);

    public static final RegistryObject<Item> AMORITE = ITEMS.register("amorite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(65)));

    public static final RegistryObject<Item> AMORITE_DETECTOR = ITEMS.register("amorite_detector",
            () -> new AmoriteDetectorItem(new Item.Properties().durability(95)));

    public static final RegistryObject<Item> END_APPLE = ITEMS.register("end_apple",
            () -> new Item(new Item.Properties().food(ModFoods.END_APPLE)));

    public static final RegistryObject<Item> END_STAFF = ITEMS.register("end_staff",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> END_COAL = ITEMS.register("end_coal",
            () -> new FuelItem(new Item.Properties(), 16000));

    public static final RegistryObject<Item> AMORITE_SWORD = ITEMS.register("amorite_sword",
            () -> new SwordItem(ModToolTiers.AMORITE, 21, 1, new Item.Properties()));
    public static final RegistryObject<Item> AMORITE_PICKAXE = ITEMS.register("amorite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AMORITE, 1, 0, new Item.Properties()));
    public static final RegistryObject<Item> AMORITE_AXE = ITEMS.register("amorite_axe",
            () -> new AxeItem(ModToolTiers.AMORITE, 31, -2, new Item.Properties()));
    public static final RegistryObject<Item> AMORITE_SHOVEL = ITEMS.register("amorite_shovel",
            () -> new ShovelItem(ModToolTiers.AMORITE, -5, 1, new Item.Properties()));
    public static final RegistryObject<Item> AMORITE_HOE = ITEMS.register("amorite_hoe",
            () -> new HoeItem(ModToolTiers.AMORITE, -5, 1, new Item.Properties()));


    public static final RegistryObject<Item> AMORITE_HELMET = ITEMS.register("amorite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.AMORITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> AMORITE_CHESTPLATE = ITEMS.register("amorite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AMORITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> AMORITE_LEGGINGS = ITEMS.register("amorite_leggings",
            () -> new ArmorItem(ModArmorMaterials.AMORITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> AMORITE_BOOTS = ITEMS.register("amorite_boots",
            () -> new ArmorItem(ModArmorMaterials.AMORITE, ArmorItem.Type.BOOTS, new Item.Properties()));






    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
