package net.saifa.quackems_the_end_update_mod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
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
        blockWithItem(ModBlocks.OVERWORLD_XP_ORE);
        blockWithItem(ModBlocks.NETHER_XP_ORE);
        blockWithItem(ModBlocks.END_PRISMARINE_BRICK);
        blockWithItem(ModBlocks.ENDSTONE_STRETCHER);
        blockWithItem(ModBlocks.END_PLANKS);
        blockWithItem(ModBlocks.END_VENEER);


        stairsBlock(((StairBlock) ModBlocks.END_STAIRS.get()), blockTexture(ModBlocks.END_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.END_SLAB.get()), blockTexture(ModBlocks.END_PLANKS.get()), blockTexture(ModBlocks.END_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.END_BUTTON.get()), blockTexture(ModBlocks.END_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.END_PRESSURE_PLATE.get()), blockTexture(ModBlocks.END_PLANKS.get()));


        fenceBlock(((FenceBlock) ModBlocks.END_FENCE.get()), blockTexture(ModBlocks.END_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.END_FENCE_GATE.get()), blockTexture(ModBlocks.END_PLANKS.get()));
        wallBlock(((WallBlock) ModBlocks.END_WALL.get()), blockTexture(ModBlocks.END_PLANKS.get()));


        doorBlockWithRenderType(((DoorBlock) ModBlocks.END_DOOR.get()), modLoc("block/end_door_bottom"), modLoc("block/end_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.END_TRAPDOOR.get()), modLoc("block/end_trapdoor"), true, "cutout");

    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
