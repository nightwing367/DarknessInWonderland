package com.nightwing.darknessinwonderland.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {

    public static void init()
    {
        //Items
        GameRegistry.addRecipe(new ItemStack(ModItems.iTear), " B ", "BSB", "BBB", 'B', new ItemStack(Items.water_bucket), 'S', new ItemStack(Items.nether_star));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.iTear), " B ", "BSB", "BBB", 'B', new ItemStack(Items.water_bucket), 'S', "ingotIron"));

        //Blocks
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blDarkness), new ItemStack(Items.dye, 1), new ItemStack(ModItems.iTear));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.blDarkness), "ingotIron", new ItemStack(ModItems.iTear)));
    }
}
