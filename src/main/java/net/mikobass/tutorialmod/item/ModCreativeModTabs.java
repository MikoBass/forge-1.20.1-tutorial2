package net.mikobass.tutorialmod.item;

import net.mikobass.tutorialmod.TutorialMod;
import net.mikobass.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> CURIOSITIES = CREATIVE_MOD_TABS.register("curiosities",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MEATBALL.get()))
                    .title(Component.translatable("creativetab.curiosities"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MEATBALL.get());
                        pOutput.accept(ModItems.ROCK.get());

                        pOutput.accept(ModBlocks.MEATBALL_BLOCK.get());
                        pOutput.accept(ModBlocks.MEATBALL_ORE.get());
                    })
                    .build());
    public static void  register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
