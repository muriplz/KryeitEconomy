package com.kryeit.kryeiteconomy.Client.event;

import com.kryeit.kryeiteconomy.Client.KeyInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ClickH {
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent(priority= EventPriority.NORMAL, receiveCanceled=true)
    public static void onClickH(TickEvent.ClientTickEvent event) {
        if(KeyInit.exampleKeyMapping.isDown()){}
    }
}
