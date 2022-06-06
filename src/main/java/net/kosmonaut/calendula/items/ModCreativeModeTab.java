package net.kosmonaut.calendula.items;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAB_CALENDULA = new CreativeModeTab("tab_calendula") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PINE_CONE.get());
        }
    };
}