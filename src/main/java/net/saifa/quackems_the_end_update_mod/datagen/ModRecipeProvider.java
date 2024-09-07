package net.saifa.quackems_the_end_update_mod.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StonecutterBlock;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.saifa.quackems_the_end_update_mod.block.ModBlocks;
import net.saifa.quackems_the_end_update_mod.item.ModItems;
import net.saifa.quackems_the_end_update_mod.util.ModTags;

import java.io.Writer;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AMORITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AMORITE.get())
                .unlockedBy(getHasName(ModItems.AMORITE.get()), has(ModItems.AMORITE.get()))
                .save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.METAL_DETECTOR.get())
                .pattern("DSS")
                .pattern("DSF")
                .pattern("AAG")
                .define('A', ModItems.AMORITE.get())
                .define('F', Items.FLINT)
                .define('S', Items.STICK)
                .define('D', Items.DIAMOND)
                .define('G', Items.GOLD_INGOT)
                .unlockedBy(getHasName(ModItems.AMORITE.get()), has(ModItems.AMORITE.get()))
                .save(recipeOutput);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMORITE_DETECTOR.get())
                .pattern("ISS")
                .pattern("ISF")
                .pattern("DDG")
                .define('D', Items.DIAMOND)
                .define('F', Items.FLINT)
                .define('S', Items.STICK)
                .define('I', Items.IRON_INGOT)
                .define('G', Items.GOLD_INGOT)
                .unlockedBy(getHasName(ModItems.AMORITE.get()), has(ModItems.AMORITE.get()))
                .save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMORITE_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.POLISHED_AMORITE.get())
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMORITE_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.POLISHED_AMORITE.get())
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMORITE_BOOTS.get())
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.POLISHED_AMORITE.get())
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMORITE_HELMET.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("A A")
                .define('A', ModItems.POLISHED_AMORITE.get())
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CORRUPTED_DIAMOND_CHESTPLATE.get())
                .pattern("D D")
                .pattern("DDD")
                .pattern("DDD")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CORRUPTED_DIAMOND_LEGGINGS.get())
                .pattern("DDD")
                .pattern("D D")
                .pattern("D D")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CORRUPTED_DIAMOND_BOOTS.get())
                .pattern("   ")
                .pattern("D D")
                .pattern("D D")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CORRUPTED_DIAMOND_HELMET.get())
                .pattern("   ")
                .pattern("DDD")
                .pattern("D D")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMORITE_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" S ")
                .define('A', ModItems.AMORITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AMORITE_PICKAXE.get())
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.AMORITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AMORITE_AXE.get())
                .pattern(" AA")
                .pattern(" SA")
                .pattern(" S ")
                .define('A', ModItems.AMORITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AMORITE_HOE.get())
                .pattern(" AA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.AMORITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AMORITE_SHOVEL.get())
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.AMORITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CORRUPTED_DIAMOND_SWORD.get())
                .pattern(" D ")
                .pattern(" D ")
                .pattern(" S ")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CORRUPTED_DIAMOND_PICKAXE.get())
                .pattern("DDD")
                .pattern(" S ")
                .pattern(" S ")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CORRUPTED_DIAMOND_AXE.get())
                .pattern(" DD")
                .pattern(" SD")
                .pattern(" S ")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CORRUPTED_DIAMOND_HOE.get())
                .pattern(" DD")
                .pattern(" S ")
                .pattern(" S ")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CORRUPTED_DIAMOND_SHOVEL.get())
                .pattern(" D ")
                .pattern(" S ")
                .pattern(" S ")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CORRUPTED_DIAMOND.get(), 2)
                .pattern("CDC")
                .pattern("ENE")
                .pattern("CDC")
                .define('C', Items.CRYING_OBSIDIAN)
                .define('D', Items.DIAMOND)
                .define('N', Items.NETHERITE_INGOT)
                .define('E', Items.ENDER_PEARL)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BAUXITE.get(), 2)
                .pattern("   ")
                .pattern("AL ")
                .pattern("D  ")
                .define('L', Items.LAPIS_LAZULI)
                .define('D', Blocks.DIORITE)
                .define('A', Blocks.ANDESITE)
                .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOUGHENED_BAUXITE.get())
                .pattern("   ")
                .pattern("BB ")
                .pattern("BB ")
                .define('B', ModBlocks.BAUXITE.get())
                .unlockedBy(getHasName(ModBlocks.BAUXITE.get()), has(ModBlocks.BAUXITE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_GRASS_BLOCK.get())
                .pattern(" E ")
                .pattern("EGE")
                .pattern(" E ")
                .define('G', Blocks.GRASS_BLOCK)
                .define('E', Items.ENDER_PEARL)
                .unlockedBy(getHasName(Blocks.GRASS_BLOCK), has(Blocks.GRASS_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMORITE_INFUSED_BOW.get())
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('B', Items.BOW)
                .define('A', ModItems.AMORITE.get())
                .unlockedBy(getHasName(Blocks.GRASS_BLOCK), has(Blocks.GRASS_BLOCK))
                .save(recipeOutput);




        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AMORITE.get(), 9)
                .requires(ModBlocks.AMORITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.AMORITE_BLOCK.get()), has(ModBlocks.AMORITE_BLOCK.get()))
                .save(recipeOutput);





        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.DECORATIONS, ModBlocks.END_PRISMARINE_BRICK.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(recipeOutput);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.DECORATIONS, ModBlocks.ENDSTONE_STRETCHER.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.DECORATIONS, ModBlocks.END_VENEER.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE, ModBlocks.END_PRISMARINE_BRICK.get()), RecipeCategory.DECORATIONS, ModBlocks.END_PRISMARINE_STAIRS.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE, ModBlocks.END_PRISMARINE_BRICK.get()), RecipeCategory.DECORATIONS, ModBlocks.END_PRISMARINE_SLAB.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE, ModBlocks.END_PRISMARINE_BRICK.get()), RecipeCategory.DECORATIONS, ModBlocks.END_PRISMARINE_WALL.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE, ModBlocks.ENDSTONE_STRETCHER.get()), RecipeCategory.DECORATIONS, ModBlocks.ENDSTONE_STRETCHER_STAIRS.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE, ModBlocks.ENDSTONE_STRETCHER.get()), RecipeCategory.DECORATIONS, ModBlocks.ENDSTONE_STRETCHER_SLAB.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE, ModBlocks.ENDSTONE_STRETCHER.get()), RecipeCategory.DECORATIONS, ModBlocks.ENDSTONE_STRETCHER_WALL.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BAUXITE.get()), RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BAUXITE.get())
                .unlockedBy("has_bauxite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.BAUXITE.get()).build()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BAUXITE.get()), RecipeCategory.DECORATIONS, ModBlocks.BAUXITE_BRICK.get())
                .unlockedBy("has_bauxite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.BAUXITE.get()).build()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.AMORITE.get()), RecipeCategory.DECORATIONS, ModItems.POLISHED_AMORITE.get())
                .unlockedBy("has_amorite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.AMORITE.get()).build()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.END_SLUDGE.get()), RecipeCategory.MISC, ModBlocks.END_SLUDGE_BRICK.get())
                .unlockedBy("has_end_sludge", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.END_SLUDGE.get()).build()))
                .save(recipeOutput);
    }
}
