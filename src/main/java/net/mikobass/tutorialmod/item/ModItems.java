package net.mikobass.tutorialmod.item;

import net.mikobass.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);


    public static final RegistryObject<Item> ROCK = ITEMS.register("rock",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MEATBALL = ITEMS.register("meatball",
            () -> new Item(new Item.Properties()));
    public static void  register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
