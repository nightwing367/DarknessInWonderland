package com.nightwing.darknessinwonderland.block;

import com.nightwing.darknessinwonderland.creativetab.CreativeTabDIW;
import com.nightwing.darknessinwonderland.tileentity.MBBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockDarkness extends BlockDIW {
    public BlockDarkness(){
        super(Material.rock);
        setBlockName("darkness");
        setBlockTextureName("darkness");
    }
    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        TileEntity tile = world.getTileEntity(x, y, z);
        if (tile != null && tile instanceof MBBase) {
            MBBase multiBlock = (MBBase) tile;
            if (multiBlock.hasMaster()) {
                if (multiBlock.isMaster()) {
                    if (!multiBlock.checkMultiBlockForm())
                        multiBlock.resetStructure();
                } else {
                    if (!multiBlock.checkForMaster())
                        multiBlock.reset();
                }
            }
        }
        super.onNeighborBlockChange(world, x, y, z, block);
    }
}
