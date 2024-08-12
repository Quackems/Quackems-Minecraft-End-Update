package net.saifa.quackems_the_end_update_mod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.item.custom.AmoriteDetectorItem;
import net.saifa.quackems_the_end_update_mod.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Quackems_The_End_Update.MOD_ID);

    public static final RegistryObject<Item> AMORITE = ITEMS.register("amorite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(65)));

    public static final RegistryObject<Item> AMORITE_DETECTOR = ITEMS.register("amorite_detector",
            () -> new AmoriteDetectorItem(new Item.Properties().durability(95)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
