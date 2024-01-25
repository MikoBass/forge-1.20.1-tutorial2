package net.mikobass.tutorialmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SOAP = new FoodProperties.Builder().nutrition(2)
            .saturationMod(1).effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 2000), 1f).build();
}
