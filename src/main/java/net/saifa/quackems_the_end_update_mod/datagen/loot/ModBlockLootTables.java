package net.saifa.quackems_the_end_update_mod.datagen.loot;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.saifa.quackems_the_end_update_mod.block.ModBlocks;
import net.saifa.quackems_the_end_update_mod.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.AMORITE_BLOCK.get());
        this.dropSelf(ModBlocks.AMORITE_ORE.get());
        this.dropSelf(ModBlocks.OVERWORLD_XP_ORE.get());
        this.dropSelf(ModBlocks.END_PRISMARINE_BRICK.get());
        this.dropSelf(ModBlocks.ENDSTONE_STRETCHER.get());
        this.dropSelf(ModBlocks.END_OAK_LOG.get());
        this.dropSelf(ModBlocks.END_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_END_OAK_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_END_WOOD.get());
        this.dropSelf(ModBlocks.END_PLANKS.get());

        this.add(ModBlocks.END_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.AMORITE_BLOCK.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: CHANGE TO SAPLING!

        this.add(ModBlocks.AMORITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.AMORITE_ORE.get(), ModItems.AMORITE.get()));

        this.add(ModBlocks.OVERWORLD_XP_ORE.get(),
                block -> createOreDrop(ModBlocks.OVERWORLD_XP_ORE.get(), Items.COBBLESTONE));

        this.add(ModBlocks.NETHER_XP_ORE.get(),
                block -> createOreDrop(ModBlocks.NETHER_XP_ORE.get(), Items.NETHERRACK));


        this.dropSelf(ModBlocks.END_STAIRS.get());
        this.dropSelf(ModBlocks.END_BUTTON.get());
        this.dropSelf(ModBlocks.END_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.END_TRAPDOOR.get());
        this.dropSelf(ModBlocks.END_FENCE.get());
        this.dropSelf(ModBlocks.END_FENCE_GATE.get());
        this.dropSelf(ModBlocks.END_WALL.get());
        this.dropSelf(ModBlocks.END_VENEER.get());

        this.dropSelf(ModBlocks.END_PRISMARINE_STAIRS.get());
        this.dropSelf(ModBlocks.END_PRISMARINE_WALL.get());

        this.dropSelf(ModBlocks.ENDSTONE_STRETCHER_STAIRS.get());
        this.dropSelf(ModBlocks.ENDSTONE_STRETCHER_WALL.get());


        this.add(ModBlocks.END_SLAB.get(),
        block -> createSlabItemTable(ModBlocks.END_SLAB.get()));

        this.add(ModBlocks.END_PRISMARINE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.END_PRISMARINE_SLAB.get()));

        this.add(ModBlocks.ENDSTONE_STRETCHER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ENDSTONE_STRETCHER_SLAB.get()));


        this.add(ModBlocks.END_DOOR.get(),
        block -> createDoorTable(ModBlocks.END_DOOR.get()));


    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
