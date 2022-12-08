package com.kryeit.kryeiteconomy.Client.event;

import com.kryeit.kryeiteconomy.Client.KeyInit;
import com.kryeit.kryeiteconomy.KryeitEconomy;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = KryeitEconomy.ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    public ClientEvents(){

    }

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent evt) {
        KeyInit.init();
    }

}
