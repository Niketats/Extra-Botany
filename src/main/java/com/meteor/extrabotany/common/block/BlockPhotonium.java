package com.meteor.extrabotany.common.block;

import com.meteor.extrabotany.common.lib.LibBlocksName;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockPhotonium extends BlockMod {

    public BlockPhotonium() {
        super(Material.IRON, LibBlocksName.BLOCKPHOTONIUM);
        setHardness(5.5F);
        setResistance(10.0F);
        setSoundType(SoundType.STONE);
    }

    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) {
        return true;
    }

}
