package com.nightwing.darknessinwonderland.handler;

import com.nightwing.darknessinwonderland.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;
    public static void init(File configFile)
        {
            //Create the handler object
            if(configuration == null) {
                configuration = new Configuration(configFile);
                loadConfiguration();
            }
        }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            //Resync configs
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("ConfigValue", Configuration.CATEGORY_GENERAL, false, "Exemple crisse");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}