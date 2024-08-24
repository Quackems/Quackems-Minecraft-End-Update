package net.saifa.quackems_the_end_update_mod.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.item.ModItems;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Quackems_The_End_Update.MOD_ID);

    public static final RegistryObject<Block> AMORITE_ORE = registerBlock("amorite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(6.5f).requiresCorrectToolForDrops(), UniformInt.of(9,15)));

    public static final RegistryObject<Block> AMORITE_BLOCK = registerBlock("amorite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_VENEER = registerBlock("end_veneer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> OVERWORLD_XP_ORE = registerBlock("overworld_xp_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(), UniformInt.of(15,30)));

    public static final RegistryObject<Block> NETHER_XP_ORE = registerBlock("nether_xp_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(1f).requiresCorrectToolForDrops(), UniformInt.of(25,45)));

    public static final RegistryObject<Block> END_PRISMARINE_BRICK = registerBlock("end_prismarine_brick",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ENDSTONE_STRETCHER = registerBlock("endstone_stretcher",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_PLANKS = registerBlock("end_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_STAIRS = registerBlock("end_stairs",
            () -> new StairBlock(() -> ModBlocks.END_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_SLAB = registerBlock("end_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_BUTTON = registerBlock("end_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).strength(3f).requiresCorrectToolForDrops(),
                    BlockSetType.OAK, 50, true));

    public static final RegistryObject<Block> END_PRESSURE_PLATE = registerBlock("end_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(3f).requiresCorrectToolForDrops(),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> END_FENCE = registerBlock("end_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_FENCE_GATE = registerBlock("end_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(3f).requiresCorrectToolForDrops(),
                    SoundEvents.NETHER_WOOD_FENCE_GATE_OPEN, SoundEvents.NETHER_WOOD_FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> END_WALL = registerBlock("end_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_DOOR = registerBlock("end_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion().strength(3f).requiresCorrectToolForDrops(),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> END_TRAPDOOR = registerBlock("end_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion().strength(3f).requiresCorrectToolForDrops(),
                    BlockSetType.OAK));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
