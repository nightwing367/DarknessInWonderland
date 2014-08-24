package com.nightwing.darknessinwonderland.init;

import com.nightwing.darknessinwonderland.block.BlockDIW;
import com.nightwing.darknessinwonderland.block.BlockDarkness;
import com.nightwing.darknessinwonderland.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockDIW blDarkness = new BlockDarkness();

    public static void init(){
        GameRegistry.registerBlock(blDarkness, "Darkness");
    }
}
