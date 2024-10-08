package net.saifa.quackems_the_end_update_mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.block.ModBlocks;
import net.saifa.quackems_the_end_update_mod.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Quackems_The_End_Update.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.AMORITE_HELMET.get(),
                        ModItems.AMORITE_CHESTPLATE.get(),
                        ModItems.AMORITE_LEGGINGS.get(),
                        ModItems.AMORITE_BOOTS.get(),
                        ModItems.CORRUPTED_DIAMOND_HELMET.get(),
                        ModItems.CORRUPTED_DIAMOND_CHESTPLATE.get(),
                        ModItems.CORRUPTED_DIAMOND_LEGGINGS.get(),
                        ModItems.CORRUPTED_DIAMOND_BOOTS.get());




        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.END_OAK_LOG.get().asItem())
                .add(ModBlocks.END_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_END_OAK_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_END_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.END_PLANKS.get().asItem());


    }





}
