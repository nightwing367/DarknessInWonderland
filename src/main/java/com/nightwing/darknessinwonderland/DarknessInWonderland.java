package com.nightwing.darknessinwonderland;

import com.nightwing.darknessinwonderland.proxy.IProxy;
import com.nightwing.darknessinwonderland.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)

public class DarknessInWonderland {
    @Mod.Instance(Reference.MOD_ID)
    public static DarknessInWonderland instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    public void preInit(FMLPreInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

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
