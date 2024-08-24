package net.saifa.quackems_the_end_update_mod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties END_APPLE = new FoodProperties.Builder().nutrition(5)
            .saturationMod(2f)
            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 100), 0.5f).build();
}
