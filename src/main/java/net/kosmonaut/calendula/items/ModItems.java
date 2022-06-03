package net.kosmonaut.calendula.items;


import net.kosmonaut.calendula.calendula;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

//DeferredRegister is a list for items used

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, calendula.MOD_ID);


    //add an item
    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16)));



    public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}

}