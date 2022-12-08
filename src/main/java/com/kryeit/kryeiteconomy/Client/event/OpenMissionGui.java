package com.kryeit.kryeiteconomy.Client.event;

import com.kryeit.kryeiteconomy.Client.KeyInit;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.TextComponent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class OpenMissionGui {

    public OpenMissionGui() {

    }

    @SubscribeEvent
    public static void onGuiOpen(InputEvent.KeyInputEvent event) {

        final var player = Minecraft.getInstance().player;

        if( KeyInit.openGuiKey.isDown() ) {
            player.sendMessage(new TextComponent("FUNCIONAAA"),player.getUUID());
        }

    }
}
