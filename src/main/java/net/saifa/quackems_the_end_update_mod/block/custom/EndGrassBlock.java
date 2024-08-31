package net.saifa.quackems_the_end_update_mod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IPlantable;
import net.saifa.quackems_the_end_update_mod.block.ModBlocks;

public class EndGrassBlock extends GrassBlock {
    public EndGrassBlock(Properties p_53685_) {
        super(p_53685_);
    }


    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
        return state.is(ModBlocks.END_GRASS_BLOCK.get());
    }
}
