package net.saifa.quackems_the_end_update_mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.block.ModBlocks;
import net.saifa.quackems_the_end_update_mod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Quackems_The_End_Update.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.AMORITE_ORE.get()).add(ModBlocks.OVERWORLD_XP_ORE.get()).add(ModBlocks.NETHER_XP_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.AMORITE_BLOCK.get(),
                        ModBlocks.AMORITE_ORE.get(),
                        ModBlocks.OVERWORLD_XP_ORE.get(),
                        ModBlocks.NETHER_XP_ORE.get(),
                        ModBlocks.END_PRISMARINE_BRICK.get(),
                        ModBlocks.ENDSTONE_STRETCHER.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.END_PLANKS.get());




        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.OVERWORLD_XP_ORE.get()).add(ModBlocks.ENDSTONE_STRETCHER.get()).add(ModBlocks.END_PRISMARINE_BRICK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.AMORITE_BLOCK.get()).add(ModBlocks.END_PLANKS.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL);

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.AMORITE_ORE.get());


        this.tag(ModTags.Blocks.NEEDS_AMORITE_TOOL);







        this.tag(BlockTags.FENCES)
                .add(ModBlocks.END_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.END_FENCE_GATE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.END_WALL.get());


    }
}