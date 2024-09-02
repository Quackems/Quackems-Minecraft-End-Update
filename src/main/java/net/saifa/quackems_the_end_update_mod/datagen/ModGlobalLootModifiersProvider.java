package net.saifa.quackems_the_end_update_mod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.Weight;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.block.ModBlocks;
import net.saifa.quackems_the_end_update_mod.item.ModItems;
import net.saifa.quackems_the_end_update_mod.loot.AddItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {


    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output ,Quackems_The_End_Update.MOD_ID);
    }

    @Override
    protected void start() {
        add("end_coal_from_end_grass", new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.END_GRASS_BLOCK.get()).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()}, ModItems.END_COAL.get()));

        add("corrupt_diamond_from_ender_dragon", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ender_dragon")).build()},
                ModItems.AMORITE.get()));

        add("corrupt_diamond_from_end_cities", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/end_city_treasure")).build()},
                ModItems.CORRUPTED_DIAMOND.get()));
    }
}
