package com.nightwing.darknessinwonderland.init;

import com.nightwing.darknessinwonderland.item.ItemDIW;
import com.nightwing.darknessinwonderland.item.ItemTear;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemDIW iTear = new ItemTear();

    public static void init(){
        GameRegistry.registerItem(iTear, "Tear");
    }
}
