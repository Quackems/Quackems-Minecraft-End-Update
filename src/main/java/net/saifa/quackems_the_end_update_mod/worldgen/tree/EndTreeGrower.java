package net.saifa.quackems_the_end_update_mod.worldgen.tree;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.saifa.quackems_the_end_update_mod.worldgen.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class EndTreeGrower{
    @Nullable
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        return ModConfiguredFeatures.END_TREE_KEY;
    }
}
