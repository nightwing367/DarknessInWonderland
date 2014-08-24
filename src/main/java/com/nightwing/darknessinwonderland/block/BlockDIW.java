package com.nightwing.darknessinwonderland.block;

import com.nightwing.darknessinwonderland.creativetab.CreativeTabDIW;
import com.nightwing.darknessinwonderland.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.world.World;

public class BlockDIW extends Block {

    public BlockDIW(Material material){
        super(material);
        this.setCreativeTab(CreativeTabDIW.DIW_TAB);
    }

    public BlockDIW(){
        this(Material.rock);
        this.setCreativeTab(CreativeTabDIW.DIW_TAB);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s%s", Reference.S_MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block){}
}
