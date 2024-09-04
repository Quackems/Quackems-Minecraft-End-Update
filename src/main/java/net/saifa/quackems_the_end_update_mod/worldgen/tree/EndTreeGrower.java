package net.saifa.quackems_the_end_update_mod.worldgen.tree;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.saifa.quackems_the_end_update_mod.worldgen.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class EndTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        return ModConfiguredFeatures.END_TREE_KEY;
    }
}
