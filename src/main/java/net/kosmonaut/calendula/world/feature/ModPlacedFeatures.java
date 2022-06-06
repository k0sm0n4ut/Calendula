package net.kosmonaut.calendula.world.feature;


import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> PINE_PLACED = PlacementUtils.register("pine_placed",
            ModConfiguredFeatures.PINE_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(2, 0.25f, 3)));
}
//PlacementUtils.countExtra(TreesPerChunk, Chance of->, thisManyTreesPerChunk