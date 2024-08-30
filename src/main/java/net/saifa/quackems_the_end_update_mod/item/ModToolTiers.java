package net.saifa.quackems_the_end_update_mod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier AMORITE = TierSortingRegistry.registerTier(
            new ForgeTier(6, 3500, 20, 8f, 25,
                    ModTags.Blocks.NEEDS_AMORITE_TOOL, () -> Ingredient.of(ModItems.AMORITE.get())),
            new ResourceLocation(Quackems_The_End_Update.MOD_ID, "amorite"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier CORRUPTED_DIAMOND = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2350, 13, 3f, 45,
                    ModTags.Blocks.NEEDS_CORRUPTED_DIAMOND_TOOL, () -> Ingredient.of(ModItems.CORRUPTED_DIAMOND.get())),
            new ResourceLocation(Quackems_The_End_Update.MOD_ID, "corrupted_diamond"), List.of(Tiers.NETHERITE), List.of());
}
