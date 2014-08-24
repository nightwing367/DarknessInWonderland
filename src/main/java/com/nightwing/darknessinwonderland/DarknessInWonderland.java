package com.nightwing.darknessinwonderland;

import com.nightwing.darknessinwonderland.client.handler.KeyInputEventHandler;
import com.nightwing.darknessinwonderland.handler.ConfigurationHandler;
import com.nightwing.darknessinwonderland.init.ModBlocks;
import com.nightwing.darknessinwonderland.init.ModItems;
import com.nightwing.darknessinwonderland.init.Recipes;
import com.nightwing.darknessinwonderland.proxy.IProxy;
import com.nightwing.darknessinwonderland.reference.Reference;
import com.nightwing.darknessinwonderland.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class DarknessInWonderland {
    @Mod.Instance(Reference.MOD_ID)
    public static DarknessInWonderland instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.registerKeyBindings();

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete!");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        Recipes.init();
        LogHelper.info("Initialization Complete!");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}



//preinitialization
//Load Blocks/items
//Load Configurations
//Initialize Network Handler
//Keybindings

//initialization
//GUI handlers
//Tile Entities
//rendering
//Event Handlers
//Initialize Recipes

//Postinitialization
