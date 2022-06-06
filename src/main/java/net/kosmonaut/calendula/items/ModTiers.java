package net.kosmonaut.calendula.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier COPPER = new ForgeTier(2, 200, 6.0f,
            2.0f, 10, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.COPPER_INGOT)); //TODO: BugFix ERROR
}

//   }),
//   IRON(2, 250, 6.0F, 2.0F, 14, () -> {
//      return Ingredient.of(Items.IRON_INGOT);
//   }),

//ERROR __>

//    public static final ForgeTier CITRINE = new ForgeTier(2, 1400, 1.5f,
//            2f, 22, BlockTags.NEEDS_IRON_TOOL,
//            () -> Ingredient.of(ModItems.CITRINE.get()));