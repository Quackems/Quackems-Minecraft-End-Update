package net.saifa.quackems_the_end_update_mod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.entity.ModEntities;
import net.saifa.quackems_the_end_update_mod.item.custom.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Quackems_The_End_Update.MOD_ID);

    public static final RegistryObject<Item> AMORITE = ITEMS.register("amorite",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> POLISHED_AMORITE = ITEMS.register("polished_amorite",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CORRUPTED_DIAMOND = ITEMS.register("corrupted_diamond",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(65)));

    public static final RegistryObject<Item> AMORITE_DETECTOR = ITEMS.register("amorite_detector",
            () -> new AmoriteDetectorItem(new Item.Properties().durability(95)));

    public static final RegistryObject<Item> END_APPLE = ITEMS.register("end_apple",
            () -> new Item(new Item.Properties().food(ModFoods.END_APPLE)));

    public static final RegistryObject<Item> END_STAFF = ITEMS.register("end_staff",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> ENDER_HILT = ITEMS.register("ender_hilt",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> END_COAL = ITEMS.register("end_coal",
            () -> new FuelItem(new Item.Properties(), 16000));

    public static final RegistryObject<Item> AMORITE_SWORD = ITEMS.register("amorite_sword",
            () -> new SwordItem(ModToolTiers.AMORITE, 21, 0, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> AMORITE_PICKAXE = ITEMS.register("amorite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AMORITE, 1, 0, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> AMORITE_AXE = ITEMS.register("amorite_axe",
            () -> new AxeItem(ModToolTiers.AMORITE, 31, -2, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> AMORITE_SHOVEL = ITEMS.register("amorite_shovel",
            () -> new ShovelItem(ModToolTiers.AMORITE, -5, 1, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> AMORITE_HOE = ITEMS.register("amorite_hoe",
            () -> new HoeItem(ModToolTiers.AMORITE, -5, 1, new Item.Properties().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> CORRUPTED_DIAMOND_SWORD = ITEMS.register("corrupted_diamond_sword",
            () -> new SwordItem(ModToolTiers.CORRUPTED_DIAMOND, 16, 0, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CORRUPTED_DIAMOND_PICKAXE = ITEMS.register("corrupted_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CORRUPTED_DIAMOND, 2, 0, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CORRUPTED_DIAMOND_AXE = ITEMS.register("corrupted_diamond_axe",
            () -> new AxeItem(ModToolTiers.CORRUPTED_DIAMOND, 26, -2, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CORRUPTED_DIAMOND_SHOVEL = ITEMS.register("corrupted_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.CORRUPTED_DIAMOND, 1, 1, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CORRUPTED_DIAMOND_HOE = ITEMS.register("corrupted_diamond_hoe",
            () -> new HoeItem(ModToolTiers.CORRUPTED_DIAMOND, 1, 1, new Item.Properties().rarity(Rarity.RARE)));


    public static final RegistryObject<Item> AMORITE_HELMET = ITEMS.register("amorite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.AMORITE, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> AMORITE_CHESTPLATE = ITEMS.register("amorite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AMORITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> AMORITE_LEGGINGS = ITEMS.register("amorite_leggings",
            () -> new ArmorItem(ModArmorMaterials.AMORITE, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> AMORITE_BOOTS = ITEMS.register("amorite_boots",
            () -> new ArmorItem(ModArmorMaterials.AMORITE, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.EPIC)));


    public static final RegistryObject<Item> CORRUPTED_DIAMOND_HELMET = ITEMS.register("corrupted_diamond_helmet",
            () -> new ModArmorItem(ModArmorMaterials.CORRUPTED_DIAMOND, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CORRUPTED_DIAMOND_CHESTPLATE = ITEMS.register("corrupted_diamond_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CORRUPTED_DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CORRUPTED_DIAMOND_LEGGINGS = ITEMS.register("corrupted_diamond_leggings",
            () -> new ArmorItem(ModArmorMaterials.CORRUPTED_DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CORRUPTED_DIAMOND_BOOTS = ITEMS.register("corrupted_diamond_boots",
            () -> new ArmorItem(ModArmorMaterials.CORRUPTED_DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.RARE)));


    public static final RegistryObject<Item> AMORITE_INFUSED_BOW = ITEMS.register("amorite_infused_bow",
            () -> new AmoriteBowItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)
                    .durability(7200)));




    public static final RegistryObject<Item> END_BRUTE_SPAWN_EGG = ITEMS.register("end_brute_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.END_BRUTE, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));

    public static final RegistryObject<Item> END_STALKER_SPAWN_EGG = ITEMS.register("end_stalker_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.END_STALKER, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
