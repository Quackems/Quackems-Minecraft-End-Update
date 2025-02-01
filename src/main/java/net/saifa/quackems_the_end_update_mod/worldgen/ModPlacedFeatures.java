package net.saifa.quackems_the_end_update_mod.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.block.ModBlocks;
import net.saifa.quackems_the_end_update_mod.worldgen.biome.ModBiomes;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> XP_ORE_PLACED_KEY = registerKey("xp_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_XP_ORE_PLACED_KEY = registerKey("nether_xp_ore_placed");
    public static final ResourceKey<PlacedFeature> END_AMORITE_ORE_PLACED_KEY = registerKey("end_amorite_ore_placed");

    public static final ResourceKey<PlacedFeature> END_TREE_PLACED_KEY = registerKey("end_tree_placed");

    public static final ResourceKey<PlacedFeature> ELVEN_ASHWOOD_TREE_PLACED_KEY = registerKey("elven_ashwood_tree_placed");

    public static final ResourceKey<PlacedFeature> END_GRASS_PLACED_KEY = ResourceKey.create(
            Registries.PLACED_FEATURE, new ResourceLocation(Quackems_The_End_Update.MOD_ID, "end_grass_placed"));



    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        Holder.Reference<ConfiguredFeature<?, ?>> configuredFeature = context.lookup(Registries.CONFIGURED_FEATURE)
                .getOrThrow(ModConfiguredFeatures.END_GRASS_KEY);


        register(context, XP_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_XP_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(60))));
        register(context, NETHER_XP_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_XP_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(120))));
        register(context, END_AMORITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_AMORITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(1,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(60))));


        register(context, END_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.END_WOOD_SAPLING.get()));

        register(context, ELVEN_ASHWOOD_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ELVEN_ASHWOOD_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.ELVEN_ASHWOOD_SAPLING.get()));

        context.register(END_GRASS_PLACED_KEY, new PlacedFeature(configuredFeature,
                List.of(
                        RarityFilter.onAverageOnceEvery(1), // Adjust spawn rate (1 in 5 chunks)
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP, // Ensure it spawns on the surface
                        BiomeFilter.biome()
                )));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Quackems_The_End_Update.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}