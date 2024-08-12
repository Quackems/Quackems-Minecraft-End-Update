package net.saifa.quackems_the_end_update_mod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
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

    }
}
