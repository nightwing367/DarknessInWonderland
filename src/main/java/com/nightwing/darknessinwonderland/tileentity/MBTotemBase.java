package com.nightwing.darknessinwonderland.tileentity;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class MBTotemBase extends MBBase {

    @Override
    public void updateEntity() {
        super.updateSuperEntity();
        if (!worldObj.isRemote) {
            if (hasMaster()) {
                if (isMaster()) {
                    // Put stuff you want the multiblock to do here!
                }
            } else {
                // Constantly check if structure is formed until it is.
                if (checkMultiBlockForm())
                    setupStructure();
            }
        }
    }

    @Override
    public boolean checkMultiBlockForm() {
        int i = 0;
        // Scan a 3x3x3 area, starting with the bottom left corner
        for (int x = xCoord - 1; x < xCoord + 2; x++){
            for (int y = yCoord; y < yCoord + 3; y++){
                for (int z = zCoord - 1; z < zCoord + 2; z++) {
                    TileEntity tile = worldObj.getTileEntity(x, y, z);
                    // Make sure tile isn't null, is an instance of the same Tile, and isn't already a part of a multiblock
                    if (tile != null && (tile instanceof MBBase)) {
                        if (this.isMaster()) {
                            if (((MBBase) tile).hasMaster()) {
                                i++;
                            }
                        }
                    } else if (!((MBBase) tile).hasMaster()) {
                        i++;
                    }
                }
            }
        }
        // check if there are 26 blocks present ((3*3*3) - 1) and check that center block is empty
        return i > 25 && worldObj.isAirBlock(xCoord, yCoord + 1, zCoord);
    }
    @Override
    public void setupStructure() {
        for (int x = xCoord - 1; x < xCoord + 2; x++){
            for (int y = yCoord; y < yCoord + 3; y++) {
                for (int z = zCoord - 1; z < zCoord + 2; z++) {
                    TileEntity tile = worldObj.getTileEntity(x, y, z);
                    // Check if block is bottom center block
                    boolean master = (x == xCoord && y == yCoord && z == zCoord);
                    if (tile != null && (tile instanceof MBBase)) {
                        ((MBBase) tile).setMasterCoords(xCoord, yCoord, zCoord);
                        ((MBBase) tile).setHasMaster(true);
                        ((MBBase) tile).setIsMaster(master);
                    }
                }
            }
        }
    }

    @Override
    public void resetStructure() {
        for (int x = xCoord - 1; x < xCoord + 2; x++) {
            for (int y = yCoord; y < yCoord + 3; y++){
                for (int z = zCoord - 1; z < zCoord + 2; z++) {
                    TileEntity tile = worldObj.getTileEntity(x, y, z);
                    // Check if block is bottom center block
                    boolean master = (x == xCoord && y == yCoord && z == zCoord);
                    if (tile != null && (tile instanceof MBBase)) {
                        ((MBBase) tile).reset();
                    }
                }
            }
        }
    }
}


