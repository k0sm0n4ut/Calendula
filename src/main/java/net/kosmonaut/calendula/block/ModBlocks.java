package net.kosmonaut.calendula.block;

import net.kosmonaut.calendula.Calendula;
import net.kosmonaut.calendula.block.custom.ModFlammableRotatedPillarBlock;
import net.kosmonaut.calendula.items.ModCreativeModeTab;
import net.kosmonaut.calendula.items.ModItems;
import net.kosmonaut.calendula.world.feature.tree.PineTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Calendula.MOD_ID);




    public static final RegistryObject<Block> PINE_LOG = registerBlock("pine_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.TAB_CALENDULA);

    public static final RegistryObject<Block> STRIPPED_PINE_LOG = registerBlock("stripped_pine_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            ModCreativeModeTab.TAB_CALENDULA);

    public static final RegistryObject<Block> PINE_WOOD = registerBlock("pine_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.TAB_CALENDULA);

    public static final RegistryObject<Block> STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            ModCreativeModeTab.TAB_CALENDULA);

    public static final RegistryObject<Block> PINE_PLANKS = registerBlock("pine_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.TAB_CALENDULA);

    public static final RegistryObject<Block> PINE_LEAVES = registerBlock("pine_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.TAB_CALENDULA);

    public static final RegistryObject<Block> PINE_SAPLING = registerBlock("pine_sapling",
            () -> new SaplingBlock(new PineTreeGrower(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.TAB_CALENDULA);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
