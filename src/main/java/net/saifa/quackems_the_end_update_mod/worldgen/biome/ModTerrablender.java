package net.saifa.quackems_the_end_update_mod.worldgen.biome;

import net.minecraft.resources.ResourceLocation;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModEndRegion(new ResourceLocation(Quackems_The_End_Update.MOD_ID, "the_end"), 5));
    }
}
