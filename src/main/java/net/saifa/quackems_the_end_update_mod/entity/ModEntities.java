package net.saifa.quackems_the_end_update_mod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.entity.custom.EndBruteEntity;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Quackems_The_End_Update.MOD_ID);


    public static final RegistryObject<EntityType<EndBruteEntity>> END_BRUTE =
            ENTITY_TYPES.register("end_brute", () -> EntityType.Builder.of(EndBruteEntity::new, MobCategory.MONSTER)
                    .sized(1, 1.75f).build("end_brute"));





    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
