package net.saifa.quackems_the_end_update_mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Quackems_The_End_Update.MOD_ID);


    public static final RegistryObject<CreativeModeTab> QUACKEMS_THE_END_UPDATE_TAB = CREATIVE_MODE_TABS.register("quackems_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMORITE.get()))
                    .title(Component.translatable("creativetab.quackems_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AMORITE.get());
                        output.accept(ModItems.METAL_DETECTOR.get());
                        output.accept(ModItems.AMORITE_DETECTOR.get());
                        output.accept(ModItems.END_APPLE.get());
                        output.accept(ModItems.END_COAL.get());



                        output.accept(ModBlocks.AMORITE_ORE.get());
                        output.accept(ModBlocks.AMORITE_BLOCK.get());
                        output.accept(ModBlocks.OVERWORLD_XP_ORE.get());
                        output.accept(ModBlocks.NETHER_XP_ORE.get());
                        output.accept(ModBlocks.END_PRISMARINE_BRICK.get());
                        output.accept(ModBlocks.ENDSTONE_STRETCHER.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
