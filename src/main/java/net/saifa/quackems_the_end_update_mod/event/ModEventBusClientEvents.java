package net.saifa.quackems_the_end_update_mod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.entity.client.EndBruteModel;
import net.saifa.quackems_the_end_update_mod.entity.client.EndStalkerModel;
import net.saifa.quackems_the_end_update_mod.entity.client.ModModelLayers;

@Mod.EventBusSubscriber(modid = Quackems_The_End_Update.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(ModModelLayers.END_BRUTE_LAYER, EndBruteModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.END_STALKER_LAYER, EndStalkerModel::createBodyLayer);
    }



}
