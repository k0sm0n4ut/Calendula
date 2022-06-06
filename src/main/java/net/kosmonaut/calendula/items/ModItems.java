package net.kosmonaut.calendula.items;


import net.kosmonaut.calendula.calendula;
import net.minecraft.world.item.*;
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
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_CALENDULA).stacksTo(16)));

    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_CALENDULA).stacksTo(64)));

    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_CALENDULA).stacksTo(64)));

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModTiers.COPPER, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TAB_CALENDULA)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModTiers.COPPER, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TAB_CALENDULA)));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModTiers.COPPER, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TAB_CALENDULA)));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModTiers.COPPER, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TAB_CALENDULA)));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModTiers.COPPER, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TAB_CALENDULA)));



    public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}

}