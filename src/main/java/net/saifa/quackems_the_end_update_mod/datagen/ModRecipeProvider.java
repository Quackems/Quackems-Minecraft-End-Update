package net.saifa.quackems_the_end_update_mod.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.block.ModBlocks;
import net.saifa.quackems_the_end_update_mod.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    private ResourceLocation makeID(String name) {
        return new ResourceLocation(Quackems_The_End_Update.MOD_ID, name);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {





        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AMORITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AMORITE.get())
                .unlockedBy(getHasName(ModItems.AMORITE.get()), has(ModItems.AMORITE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CORRUPTED_DIAMOND_BLOCK.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModItems.CORRUPTED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(consumer);


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
                .save(consumer);



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
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMORITE_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.POLISHED_AMORITE.get())
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMORITE_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.POLISHED_AMORITE.get())
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMORITE_BOOTS.get())
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.POLISHED_AMORITE.get())
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMORITE_HELMET.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("A A")
                .define('A', ModItems.POLISHED_AMORITE.get())
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CORRUPTED_DIAMOND_CHESTPLATE.get())
                .pattern("D D")
                .pattern("DDD")
                .pattern("DDD")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CORRUPTED_DIAMOND_LEGGINGS.get())
                .pattern("DDD")
                .pattern("D D")
                .pattern("D D")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CORRUPTED_DIAMOND_BOOTS.get())
                .pattern("   ")
                .pattern("D D")
                .pattern("D D")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CORRUPTED_DIAMOND_HELMET.get())
                .pattern("   ")
                .pattern("DDD")
                .pattern("D D")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMORITE_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" S ")
                .define('A', ModItems.AMORITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AMORITE_PICKAXE.get())
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.AMORITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AMORITE_AXE.get())
                .pattern(" AA")
                .pattern(" SA")
                .pattern(" S ")
                .define('A', ModItems.AMORITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AMORITE_HOE.get())
                .pattern(" AA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.AMORITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AMORITE_SHOVEL.get())
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.AMORITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.POLISHED_AMORITE.get()), has(ModItems.POLISHED_AMORITE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CORRUPTED_DIAMOND_SWORD.get())
                .pattern(" D ")
                .pattern(" D ")
                .pattern(" S ")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CORRUPTED_DIAMOND_PICKAXE.get())
                .pattern("DDD")
                .pattern(" S ")
                .pattern(" S ")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CORRUPTED_DIAMOND_AXE.get())
                .pattern(" DD")
                .pattern(" SD")
                .pattern(" S ")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CORRUPTED_DIAMOND_HOE.get())
                .pattern(" DD")
                .pattern(" S ")
                .pattern(" S ")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CORRUPTED_DIAMOND_SHOVEL.get())
                .pattern(" D ")
                .pattern(" S ")
                .pattern(" S ")
                .define('D', ModItems.CORRUPTED_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CORRUPTED_DIAMOND.get(), 2)
                .pattern("CDC")
                .pattern("ENE")
                .pattern("CDC")
                .define('C', Items.CRYING_OBSIDIAN)
                .define('D', Items.DIAMOND)
                .define('N', Items.NETHERITE_INGOT)
                .define('E', Items.ENDER_PEARL)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(consumer, makeID("corrupted_diamond_from_many"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BAUXITE.get(), 2)
                .pattern("   ")
                .pattern("AL ")
                .pattern("D  ")
                .define('L', Items.LAPIS_LAZULI)
                .define('D', Blocks.DIORITE)
                .define('A', Blocks.ANDESITE)
                .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDER_HILT.get())
                .pattern("OCO")
                .pattern("CSC")
                .pattern("OCO")
                .define('S', Items.STICK)
                .define('C', ModItems.CORRUPTED_DIAMOND.get())
                .define('O', Blocks.OBSIDIAN)
                .unlockedBy(getHasName(ModItems.CORRUPTED_DIAMOND.get()), has(ModItems.CORRUPTED_DIAMOND.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOUGHENED_BAUXITE.get())
                .pattern("   ")
                .pattern("BB ")
                .pattern("BB ")
                .define('B', ModBlocks.BAUXITE.get())
                .unlockedBy(getHasName(ModBlocks.BAUXITE.get()), has(ModBlocks.BAUXITE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMORITE_INFUSED_BOW.get())
                .pattern(" EC")
                .pattern("EBA")
                .pattern(" EC")
                .define('B', Items.BOW)
                .define('A', ModItems.AMORITE.get())
                .define('C', ModItems.CORRUPTED_DIAMOND.get())
                .define('E', ModItems.ENDER_HILT.get())
                .unlockedBy(getHasName(ModItems.ENDER_HILT.get()), has(ModItems.ENDER_HILT.get()))
                .save(consumer);
        

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_WOOD.get(), 4)
                .pattern("   ")
                .pattern("LL ")
                .pattern("LL ")
                .define('L', ModBlocks.END_OAK_LOG.get())
                .unlockedBy(getHasName(ModBlocks.END_OAK_LOG.get()), has(ModBlocks.END_OAK_LOG.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_FENCE.get() ,3)
                .pattern("   ")
                .pattern("PSP")
                .pattern("PSP")
                .define('P', ModBlocks.END_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.END_PLANKS.get()), has(ModBlocks.END_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_FENCE_GATE.get())
                .pattern("   ")
                .pattern("SPS")
                .pattern("SPS")
                .define('P', ModBlocks.END_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.END_PLANKS.get()), has(ModBlocks.END_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_STAIRS.get())
                .pattern("  P")
                .pattern(" PP")
                .pattern("PPP")
                .define('P', ModBlocks.END_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.END_PLANKS.get()), has(ModBlocks.END_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_PRESSURE_PLATE.get(), 2)
                .pattern("   ")
                .pattern("   ")
                .pattern("PP ")
                .define('P', ModBlocks.END_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.END_PLANKS.get()), has(ModBlocks.END_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_DOOR.get(), 3)
                .pattern("PP ")
                .pattern("PP ")
                .pattern("PP ")
                .define('P', ModBlocks.END_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.END_PLANKS.get()), has(ModBlocks.END_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_TRAPDOOR.get(), 2)
                .pattern("   ")
                .pattern("PPP")
                .pattern("PPP")
                .define('P', ModBlocks.END_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.END_PLANKS.get()), has(ModBlocks.END_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_SLAB.get(), 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("PPP")
                .define('P', ModBlocks.END_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.END_PLANKS.get()), has(ModBlocks.END_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_WALL.get(), 6)
                .pattern(" P ")
                .pattern("PPP")
                .pattern("PPP")
                .define('P', ModBlocks.END_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.END_PLANKS.get()), has(ModBlocks.END_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PURPUR_LANTERN.get())
                .pattern("FEF")
                .pattern("ESE")
                .pattern("FEF")
                .define('F', Blocks.PEARLESCENT_FROGLIGHT)
                .define('S', Blocks.SEA_LANTERN)
                .define('E', Items.ENDER_PEARL)
                .unlockedBy(getHasName(Blocks.SEA_LANTERN), has(Blocks.SEA_LANTERN))
                .save(consumer);




        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.BURGER.get())
                .pattern(" S ")
                .pattern(" P ")
                .pattern(" B ")
                .define('P', ModItems.PATTY.get())
                .define('B', Items.BREAD)
                .define('S', ModItems.SEEDED_BREAD.get())
                .unlockedBy(getHasName(Items.COOKED_BEEF), has(Items.COOKED_BEEF))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.SEEDED_BREAD.get())
                .pattern("   ")
                .pattern(" S ")
                .pattern(" B ")
                .define('B', Items.BREAD)
                .define('S', Items.WHEAT_SEEDS)
                .unlockedBy(getHasName(Items.BREAD), has(Items.BREAD))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.LAMB_KEBAB.get())
                .pattern(" L ")
                .pattern("BL ")
                .pattern(" S ")
                .define('B', Items.BEETROOT)
                .define('S', Items.STICK)
                .define('L', Items.COOKED_MUTTON)
                .unlockedBy(getHasName(Items.COOKED_MUTTON), has(Items.COOKED_MUTTON))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.CHICKEN_KEBAB.get())
                .pattern(" C ")
                .pattern("BC ")
                .pattern(" S ")
                .define('B', Items.BEETROOT)
                .define('S', Items.STICK)
                .define('C', Items.COOKED_CHICKEN)
                .unlockedBy(getHasName(Items.COOKED_CHICKEN), has(Items.COOKED_CHICKEN))
                .save(consumer);





        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AMORITE.get(), 9)
                .requires(ModBlocks.AMORITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.AMORITE_BLOCK.get()), has(ModBlocks.AMORITE_BLOCK.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CORRUPTED_DIAMOND.get(), 9)
                .requires(ModBlocks.CORRUPTED_DIAMOND_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CORRUPTED_DIAMOND_BLOCK.get()), has(ModBlocks.CORRUPTED_DIAMOND_BLOCK.get()))
                .save(consumer, (makeID("corrupted_diamond_from_corrupted_diamond_block_2")));


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_PLANKS.get(), 4)
                .requires(ModBlocks.END_OAK_LOG.get())
                .unlockedBy(getHasName(ModBlocks.END_OAK_LOG.get()), has(ModBlocks.END_OAK_LOG.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_OAK_LOG.get(), 4)
                .requires(ModBlocks.END_WOOD.get(), 4)
                .unlockedBy(getHasName(ModBlocks.END_WOOD.get()), has(ModBlocks.END_WOOD.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_BUTTON.get(), 1)
                .requires(ModBlocks.END_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.END_PLANKS.get()), has(ModBlocks.END_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.PATTY.get())
                .requires(Items.COOKED_BEEF)
                .unlockedBy(getHasName(Items.COOKED_BEEF), has(Items.COOKED_BEEF))
                .save(consumer);







        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.DECORATIONS, ModBlocks.END_PRISMARINE_BRICK.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(consumer);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.DECORATIONS, ModBlocks.ENDSTONE_STRETCHER.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.DECORATIONS, ModBlocks.END_VENEER.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE, ModBlocks.END_PRISMARINE_BRICK.get()), RecipeCategory.DECORATIONS, ModBlocks.END_PRISMARINE_STAIRS.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE, ModBlocks.END_PRISMARINE_BRICK.get()), RecipeCategory.DECORATIONS, ModBlocks.END_PRISMARINE_SLAB.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE, ModBlocks.END_PRISMARINE_BRICK.get()), RecipeCategory.DECORATIONS, ModBlocks.END_PRISMARINE_WALL.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE, ModBlocks.ENDSTONE_STRETCHER.get()), RecipeCategory.DECORATIONS, ModBlocks.ENDSTONE_STRETCHER_STAIRS.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE, ModBlocks.ENDSTONE_STRETCHER.get()), RecipeCategory.DECORATIONS, ModBlocks.ENDSTONE_STRETCHER_SLAB.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE, ModBlocks.ENDSTONE_STRETCHER.get()), RecipeCategory.DECORATIONS, ModBlocks.ENDSTONE_STRETCHER_WALL.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BAUXITE.get()), RecipeCategory.DECORATIONS, ModBlocks.POLISHED_BAUXITE.get())
                .unlockedBy("has_bauxite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.BAUXITE.get()).build()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BAUXITE.get()), RecipeCategory.DECORATIONS, ModBlocks.BAUXITE_BRICK.get())
                .unlockedBy("has_bauxite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.BAUXITE.get()).build()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.AMORITE.get()), RecipeCategory.DECORATIONS, ModItems.POLISHED_AMORITE.get())
                .unlockedBy("has_amorite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.AMORITE.get()).build()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.END_SLUDGE.get()), RecipeCategory.MISC, ModBlocks.END_SLUDGE_BRICK.get())
                .unlockedBy("has_end_sludge", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.END_SLUDGE.get()).build()))
                .save(consumer);



    }
}
