package net.saifa.quackems_the_end_update_mod.recipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Quackems_The_End_Update.MOD_ID);

    public static final RegistryObject<RecipeSerializer<EndSawRecipe>> END_SAWING_SERIALIZER =
            SERIALIZERS.register("end_sawing", () -> EndSawRecipe.Serializer.INSTANCE);


    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
