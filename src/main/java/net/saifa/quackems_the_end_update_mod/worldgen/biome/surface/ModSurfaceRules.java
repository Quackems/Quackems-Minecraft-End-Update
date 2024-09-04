package net.saifa.quackems_the_end_update_mod.worldgen.biome.surface;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.saifa.quackems_the_end_update_mod.block.ModBlocks;
import net.saifa.quackems_the_end_update_mod.worldgen.biome.ModBiomes;

public class ModSurfaceRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(ModBlocks.END_SLUDGE.get());
    private static final SurfaceRules.RuleSource END_GRASS = makeStateRule(ModBlocks.END_GRASS_BLOCK.get());
    private static final SurfaceRules.RuleSource AMORITE = makeStateRule(ModBlocks.AMORITE_BLOCK.get());
    private static final SurfaceRules.RuleSource SLUDGE = makeStateRule(ModBlocks.END_SLUDGE.get());


    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);

        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, END_GRASS), DIRT);

        return SurfaceRules.sequence(
                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.END_FOREST),
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, END_GRASS)),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, SLUDGE)),


                // Default to a grass and dirt surface
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, grassSurface)
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
