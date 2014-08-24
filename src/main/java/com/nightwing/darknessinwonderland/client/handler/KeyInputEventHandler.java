package com.nightwing.darknessinwonderland.client.handler;

import com.nightwing.darknessinwonderland.client.settings.Keybindings;
import com.nightwing.darknessinwonderland.reference.Key;
import com.nightwing.darknessinwonderland.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler {

    private static Key getPressedKeybinding(){
        if (Keybindings.charge.isPressed()){
            return Key.CHARGE;
        }
        else if (Keybindings.release.isPressed()){
            return Key.RELEASE;
        }
        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event){
        LogHelper.info(getPressedKeybinding());
    }
}
