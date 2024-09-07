package net.saifa.quackems_the_end_update_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.block.custom.ModFlammableRotatedPillarBlock;
import net.saifa.quackems_the_end_update_mod.item.ModItems;
import net.saifa.quackems_the_end_update_mod.worldgen.tree.EndTreeGrower;

import java.util.function.Supplier;

public class ModBlocks {


    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Quackems_The_End_Update.MOD_ID);

    public static final RegistryObject<Block> AMORITE_ORE = registerBlock("amorite_ore",
            () -> new DropExperienceBlock(UniformInt.of(9,15), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(6.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AMORITE_BLOCK = registerBlock("amorite_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_END_STONE_BRICK = registerBlock("cracked_end_stone_brick",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BAUXITE = registerBlock("bauxite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TOUGHENED_BAUXITE = registerBlock("toughened_bauxite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_BAUXITE = registerBlock("polished_bauxite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BAUXITE_BRICK = registerBlock("bauxite_brick",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).strength(3f).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> PURPUR_LANTERN = registerBlock("purpur_lantern",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SEA_LANTERN).strength(3f).requiresCorrectToolForDrops().lightLevel((p_152688_) -> {
                return 15;
            })));

    public static final RegistryObject<Block> END_SLUDGE = registerBlock("end_sludge",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SLIME_BLOCK).strength(5f).requiresCorrectToolForDrops()
                    .jumpFactor(1.5f)
                    .speedFactor(0.1f)));

    public static final RegistryObject<Block> END_SLUDGE_BRICK = registerBlock("end_sludge_brick",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).strength(5f).requiresCorrectToolForDrops()
                    .jumpFactor(0.1f)
                    .speedFactor(1.25f)));

    public static final RegistryObject<Block> END_GRASS_BLOCK = registerBlock("end_grass_block",
            () -> new GrassBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK).strength(3f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_GRASS = registerBlock("end_grass_flower",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_GRASS).noOcclusion().noCollission()));


    public static final RegistryObject<Block> END_PLANKS = registerBlock("end_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> END_VENEER = registerBlock("end_veneer",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).requiresCorrectToolForDrops()));




    public static final RegistryObject<Block> STONE_XP_ORE = registerBlock("stone_xp_ore",
            () -> new DropExperienceBlock(UniformInt.of(15,30), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_XP_ORE = registerBlock("deepslate_xp_ore",
            () -> new DropExperienceBlock(UniformInt.of(20,35), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(2.75f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_XP_ORE = registerBlock("nether_xp_ore",
            () -> new DropExperienceBlock(UniformInt.of(30,50), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK).strength(1f)
                                .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_PRISMARINE_BRICK = registerBlock("end_prismarine_brick",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ENDSTONE_STRETCHER = registerBlock("endstone_stretcher",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS).requiresCorrectToolForDrops()));




    public static final RegistryObject<Block> END_SLAB = registerBlock("end_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_BUTTON = registerBlock("end_button",
            () -> new ButtonBlock(BlockSetType.OAK,50, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_PRESSURE_PLATE = registerBlock("end_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_FENCE = registerBlock("end_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(3f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> END_WALL = registerBlock("end_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_DOOR = registerBlock("end_door",
            () -> new DoorBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_TRAPDOOR = registerBlock("end_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_PRISMARINE_STAIRS = registerBlock("end_prismarine_stairs",
            () -> new StairBlock(ModBlocks.END_PRISMARINE_BRICK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_PRISMARINE_SLAB = registerBlock("end_prismarine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_PRISMARINE_WALL = registerBlock("end_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ENDSTONE_STRETCHER_STAIRS = registerBlock("endstone_stretcher_stairs",
            () -> new StairBlock(ModBlocks.ENDSTONE_STRETCHER.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ENDSTONE_STRETCHER_SLAB = registerBlock("endstone_stretcher_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ENDSTONE_STRETCHER_WALL = registerBlock("endstone_stretcher_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_OAK_LOG = registerBlock("end_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).requiresCorrectToolForDrops().strength(4.5f)));


    public static TreeGrower treeGrower;
    public static final RegistryObject<Block> END_WOOD_SAPLING = registerBlock("end_wood_sapling",
            () -> new SaplingBlock(treeGrower, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SAPLING)));

    public static final RegistryObject<Block> END_WOOD = registerBlock("end_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).requiresCorrectToolForDrops().strength(4.5f)));

    public static final RegistryObject<Block> STRIPPED_END_OAK_LOG = registerBlock("stripped_end_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).requiresCorrectToolForDrops().strength(4.5f)));

    public static final RegistryObject<Block> STRIPPED_END_WOOD = registerBlock("stripped_end_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).requiresCorrectToolForDrops().strength(4.5f)));





    public static final RegistryObject<Block> END_LEAVES = registerBlock("end_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });





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
