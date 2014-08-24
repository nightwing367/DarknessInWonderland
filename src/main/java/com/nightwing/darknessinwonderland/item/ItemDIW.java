package com.nightwing.darknessinwonderland.item;

import com.nightwing.darknessinwonderland.creativetab.CreativeTabDIW;
import com.nightwing.darknessinwonderland.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemDIW extends Item{
    public ItemDIW(){
        super();
        this.maxStackSize = 1;
        this.setNoRepair();
        this.setCreativeTab(CreativeTabDIW.DIW_TAB);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("item.%s%s", Reference.S_MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack){
        return String.format("item.%s%s", Reference.S_MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }
}