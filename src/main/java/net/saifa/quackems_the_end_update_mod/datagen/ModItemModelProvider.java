package net.saifa.quackems_the_end_update_mod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.block.ModBlocks;
import net.saifa.quackems_the_end_update_mod.item.ModItems;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {


    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Quackems_The_End_Update.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.AMORITE);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.AMORITE_DETECTOR);
        simpleItem(ModItems.END_APPLE);
        simpleItem(ModItems.END_COAL);
        simpleItem(ModItems.POLISHED_AMORITE);
        simpleItem(ModItems.CORRUPTED_DIAMOND);
        simpleItem(ModItems.ENDER_HILT);

        simpleBlockItem(ModBlocks.END_DOOR);

        fenceItem(ModBlocks.END_FENCE, ModBlocks.END_PLANKS);//TODO:FIX THIS
        buttonItem(ModBlocks.END_BUTTON, ModBlocks.END_PLANKS);
        wallItem(ModBlocks.END_WALL, ModBlocks.END_PLANKS);

        wallItem(ModBlocks.END_PRISMARINE_WALL, ModBlocks.END_PRISMARINE_BRICK);

        wallItem(ModBlocks.ENDSTONE_STRETCHER_WALL, ModBlocks.ENDSTONE_STRETCHER);

        evenSimplerBlockItem(ModBlocks.END_STAIRS);
        evenSimplerBlockItem(ModBlocks.END_SLAB);
        evenSimplerBlockItem(ModBlocks.END_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.END_FENCE_GATE);


        evenSimplerBlockItem(ModBlocks.END_PRISMARINE_STAIRS);
        evenSimplerBlockItem(ModBlocks.END_PRISMARINE_SLAB);

        evenSimplerBlockItem(ModBlocks.ENDSTONE_STRETCHER_STAIRS);
        evenSimplerBlockItem(ModBlocks.ENDSTONE_STRETCHER_SLAB);

        trapdoorItem(ModBlocks.END_TRAPDOOR);


        handheldItem(ModItems.AMORITE_AXE);
        handheldItem(ModItems.AMORITE_SWORD);
        handheldItem(ModItems.AMORITE_HOE);
        handheldItem(ModItems.AMORITE_PICKAXE);
        handheldItem(ModItems.AMORITE_SHOVEL);

        handheldItem(ModItems.CORRUPTED_DIAMOND_AXE);
        handheldItem(ModItems.CORRUPTED_DIAMOND_SWORD);
        handheldItem(ModItems.CORRUPTED_DIAMOND_HOE);
        handheldItem(ModItems.CORRUPTED_DIAMOND_PICKAXE);
        handheldItem(ModItems.CORRUPTED_DIAMOND_SHOVEL);

        trimmedArmorItem(ModItems.AMORITE_HELMET);
        trimmedArmorItem(ModItems.AMORITE_CHESTPLATE);
        trimmedArmorItem(ModItems.AMORITE_LEGGINGS);
        trimmedArmorItem(ModItems.AMORITE_BOOTS);
        trimmedArmorItem(ModItems.CORRUPTED_DIAMOND_HELMET);
        trimmedArmorItem(ModItems.CORRUPTED_DIAMOND_CHESTPLATE);
        trimmedArmorItem(ModItems.CORRUPTED_DIAMOND_LEGGINGS);
        trimmedArmorItem(ModItems.CORRUPTED_DIAMOND_BOOTS);


        simpleBlockItemBlockTexture(ModBlocks.END_GRASS);



        withExistingParent(ModItems.END_BRUTE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));


    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = Quackems_The_End_Update.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Quackems_The_End_Update.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Quackems_The_End_Update.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(Quackems_The_End_Update.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(Quackems_The_End_Update.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(Quackems_The_End_Update.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Quackems_The_End_Update.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Quackems_The_End_Update.MOD_ID,"block/" + item.getId().getPath()));
    }




    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Quackems_The_End_Update.MOD_ID,"item/" + item.getId().getPath()));

    }
}
