package net.saifa.quackems_the_end_update_mod.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
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
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AMORITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AMORITE.get())
                .unlockedBy(getHasName(ModItems.AMORITE.get()), has(ModItems.AMORITE.get()))
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




        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AMORITE.get(), 9)
                .requires(ModBlocks.AMORITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.AMORITE_BLOCK.get()), has(ModBlocks.AMORITE_BLOCK.get()))
                .save(consumer);



        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.MISC, ModBlocks.END_PRISMARINE_BRICK.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(consumer);


        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.MISC, ModBlocks.ENDSTONE_STRETCHER.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.END_STONE), RecipeCategory.MISC, ModBlocks.END_VENEER.get())
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.END_STONE).build()))
                .save(consumer);




    }
}
