package net.saifa.quackems_the_end_update_mod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

public class GrassBlock extends net.minecraft.world.level.block.GrassBlock {
    public GrassBlock(Properties p_53685_) {
        super(p_53685_);
    }


    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter level, BlockPos pos, Direction direction, IPlantable plantable) {
        PlantType plantType = plantable.getPlantType(level, pos);
        return plantType == PlantType.CROP || plantType == PlantType.PLAINS || plantType == PlantType.CAVE ||
                plantType == PlantType.DESERT || plantType == PlantType.BEACH;
    }
}
