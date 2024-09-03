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
                .add(ModBlocks.AMORITE_ORE.get())
                .add(ModBlocks.STONE_XP_ORE.get())
                .add(ModBlocks.DEEPSLATE_XP_ORE.get())
                .add(ModBlocks.NETHER_XP_ORE.get())
                .addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.END_GRASS_BLOCK.get())
                .add(ModBlocks.END_SLUDGE.get());




        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.AMORITE_BLOCK.get(),
                        ModBlocks.AMORITE_ORE.get(),
                        ModBlocks.STONE_XP_ORE.get(),
                        ModBlocks.DEEPSLATE_XP_ORE.get(),
                        ModBlocks.NETHER_XP_ORE.get(),
                        ModBlocks.END_PRISMARINE_BRICK.get(),
                        ModBlocks.ENDSTONE_STRETCHER.get(),
                        ModBlocks.END_PRISMARINE_SLAB.get(),
                        ModBlocks.END_PRISMARINE_WALL.get(),
                        ModBlocks.END_PRISMARINE_STAIRS.get(),
                        ModBlocks.ENDSTONE_STRETCHER_SLAB.get(),
                        ModBlocks.ENDSTONE_STRETCHER_WALL.get(),
                        ModBlocks.ENDSTONE_STRETCHER_STAIRS.get(),
                        ModBlocks.END_SLUDGE_BRICK.get(),
                        ModBlocks.CRACKED_END_STONE_BRICK.get(),
                        ModBlocks.BAUXITE.get(),
                        ModBlocks.TOUGHENED_BAUXITE.get(),
                        ModBlocks.POLISHED_BAUXITE.get(),
                        ModBlocks.BAUXITE_BRICK.get(),
                        ModBlocks.POLISHED_BAUXITE_BUTTON.get(),
                        ModBlocks.PURPUR_LANTERN.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.END_STAIRS.get())
                .add(ModBlocks.END_SLAB.get())
                .add(ModBlocks.END_WALL.get())
                .add(ModBlocks.END_PRESSURE_PLATE.get())
                .add(ModBlocks.END_FENCE.get())
                .add(ModBlocks.END_FENCE_GATE.get())
                .add(ModBlocks.END_DOOR.get())
                .add(ModBlocks.END_TRAPDOOR.get())
                .add(ModBlocks.END_BUTTON.get())
                .add(ModBlocks.END_OAK_LOG.get())
                .add(ModBlocks.END_WOOD.get())
                .add(ModBlocks.STRIPPED_END_OAK_LOG.get())
                .add(ModBlocks.STRIPPED_END_WOOD.get());




        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.STONE_XP_ORE.get())
                .add(ModBlocks.ENDSTONE_STRETCHER.get())
                .add(ModBlocks.CRACKED_END_STONE_BRICK.get())
                .add(ModBlocks.END_PRISMARINE_BRICK.get())
                .add(ModBlocks.BAUXITE.get())
                .add(ModBlocks.TOUGHENED_BAUXITE.get())
                .add(ModBlocks.POLISHED_BAUXITE.get())
                .add(ModBlocks.BAUXITE_BRICK.get())
                .add(ModBlocks.POLISHED_BAUXITE_BUTTON.get())
                .add(ModBlocks.PURPUR_LANTERN.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.AMORITE_BLOCK.get())
                .add(ModBlocks.END_STAIRS.get())
                .add(ModBlocks.END_SLAB.get())
                .add(ModBlocks.END_WALL.get())
                .add(ModBlocks.END_PRESSURE_PLATE.get())
                .add(ModBlocks.END_FENCE.get())
                .add(ModBlocks.END_FENCE_GATE.get())
                .add(ModBlocks.END_DOOR.get())
                .add(ModBlocks.END_TRAPDOOR.get())
                .add(ModBlocks.END_BUTTON.get())
                .add(ModBlocks.END_PRISMARINE_STAIRS.get())
                .add(ModBlocks.END_PRISMARINE_WALL.get())
                .add(ModBlocks.END_PRISMARINE_SLAB.get())
                .add(ModBlocks.ENDSTONE_STRETCHER_STAIRS.get())
                .add(ModBlocks.ENDSTONE_STRETCHER_WALL.get())
                .add(ModBlocks.ENDSTONE_STRETCHER_SLAB.get())
                .add(ModBlocks.END_OAK_LOG.get())
                .add(ModBlocks.END_WOOD.get())
                .add(ModBlocks.STRIPPED_END_OAK_LOG.get())
                .add(ModBlocks.STRIPPED_END_WOOD.get())
                .add(ModBlocks.END_GRASS_BLOCK.get())
                .add(ModBlocks.END_SLUDGE.get())
                .add(ModBlocks.END_SLUDGE_BRICK.get())
                .add(ModBlocks.DEEPSLATE_XP_ORE.get())
                .add(ModBlocks.NETHER_XP_ORE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL);

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.AMORITE_ORE.get());


        this.tag(ModTags.Blocks.NEEDS_AMORITE_TOOL);







        this.tag(BlockTags.FENCES)
                .add(ModBlocks.END_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.END_FENCE_GATE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.END_WALL.get())
                .add(ModBlocks.END_PRISMARINE_WALL.get())
                .add(ModBlocks.ENDSTONE_STRETCHER_WALL.get());


        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.END_OAK_LOG.get())
                .add(ModBlocks.END_WOOD.get())
                .add(ModBlocks.STRIPPED_END_OAK_LOG.get())
                .add(ModBlocks.STRIPPED_END_WOOD.get());


        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.END_PLANKS.get());



    }
}