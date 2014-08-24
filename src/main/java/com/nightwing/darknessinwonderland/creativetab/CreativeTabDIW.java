package com.nightwing.darknessinwonderland.creativetab;

import com.nightwing.darknessinwonderland.init.ModItems;
import com.nightwing.darknessinwonderland.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabDIW {
    public static final CreativeTabs DIW_TAB = new CreativeTabs(Reference.S_MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.iTear;
        }
    };
}
