package net.saifa.quackems_the_end_update_mod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Quackems_The_End_Update.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.AMORITE_BLOCK);
        blockWithItem(ModBlocks.AMORITE_ORE);
        blockWithItem(ModBlocks.STONE_XP_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_XP_ORE);
        blockWithItem(ModBlocks.NETHER_XP_ORE);
        blockWithItem(ModBlocks.END_PRISMARINE_BRICK);
        blockWithItem(ModBlocks.ENDSTONE_STRETCHER);
        blockWithItem(ModBlocks.END_VENEER);
        blockWithItem(ModBlocks.END_PLANKS);
        blockWithItem(ModBlocks.END_SLUDGE);
        blockWithItem(ModBlocks.CRACKED_END_STONE_BRICK);
        blockWithItem(ModBlocks.BAUXITE);
        blockWithItem(ModBlocks.TOUGHENED_BAUXITE);



        stairsBlock(((StairBlock) ModBlocks.END_STAIRS.get()), blockTexture(ModBlocks.END_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.END_SLAB.get()), blockTexture(ModBlocks.END_PLANKS.get()), blockTexture(ModBlocks.END_PLANKS.get()));

        stairsBlock(((StairBlock) ModBlocks.END_PRISMARINE_STAIRS.get()), blockTexture(ModBlocks.END_PRISMARINE_BRICK.get()));
        slabBlock(((SlabBlock) ModBlocks.END_PRISMARINE_SLAB.get()), blockTexture(ModBlocks.END_PRISMARINE_BRICK.get()), blockTexture(ModBlocks.END_PRISMARINE_BRICK.get()));


        stairsBlock(((StairBlock) ModBlocks.ENDSTONE_STRETCHER_STAIRS.get()), blockTexture(ModBlocks.ENDSTONE_STRETCHER.get()));
        slabBlock(((SlabBlock) ModBlocks.ENDSTONE_STRETCHER_SLAB.get()), blockTexture(ModBlocks.ENDSTONE_STRETCHER.get()), blockTexture(ModBlocks.ENDSTONE_STRETCHER.get()));

        buttonBlock(((ButtonBlock) ModBlocks.END_BUTTON.get()), blockTexture(ModBlocks.END_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.END_PRESSURE_PLATE.get()), blockTexture(ModBlocks.END_PLANKS.get()));


        fenceBlock(((FenceBlock) ModBlocks.END_FENCE.get()), blockTexture(ModBlocks.END_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.END_FENCE_GATE.get()), blockTexture(ModBlocks.END_PLANKS.get()));
        wallBlock(((WallBlock) ModBlocks.END_WALL.get()), blockTexture(ModBlocks.END_PLANKS.get()));

        wallBlock(((WallBlock) ModBlocks.END_PRISMARINE_WALL.get()), blockTexture(ModBlocks.END_PRISMARINE_BRICK.get()));

        wallBlock(((WallBlock) ModBlocks.ENDSTONE_STRETCHER_WALL.get()), blockTexture(ModBlocks.ENDSTONE_STRETCHER.get()));


        doorBlockWithRenderType(((DoorBlock) ModBlocks.END_DOOR.get()), modLoc("block/end_door_bottom"), modLoc("block/end_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.END_TRAPDOOR.get()), modLoc("block/end_trapdoor"), true, "cutout");






        logBlock(((RotatedPillarBlock) ModBlocks.END_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.END_WOOD.get()), blockTexture(ModBlocks.END_OAK_LOG.get()),
                blockTexture(ModBlocks.END_OAK_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_END_OAK_LOG.get()), blockTexture(ModBlocks.STRIPPED_END_OAK_LOG.get()),
                new ResourceLocation(Quackems_The_End_Update.MOD_ID, "block/stripped_end_oak_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_END_WOOD.get()), blockTexture(ModBlocks.STRIPPED_END_OAK_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_END_OAK_LOG.get()));

        blockItem(ModBlocks.END_OAK_LOG);
        blockItem(ModBlocks.END_WOOD);
        blockItem(ModBlocks.STRIPPED_END_OAK_LOG);
        blockItem(ModBlocks.STRIPPED_END_WOOD);



        leavesBlock(ModBlocks.END_LEAVES);


        simpleBlockWithItem(ModBlocks.END_SAW_BLOCK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/end_saw_block")));

        simpleBlockWithItem(ModBlocks.END_GRASS_BLOCK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/end_grass_block")));

        simpleBlockWithItem(ModBlocks.END_GRASS.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/end_grass_flower")));

        simpleBlockWithItem(ModBlocks.END_SLUDGE_BRICK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/end_sludge_brick")));

        simpleBlockWithItem(ModBlocks.PURPUR_LANTERN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/purpur_lantern")));


    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(Quackems_The_End_Update.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }


    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }




    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
