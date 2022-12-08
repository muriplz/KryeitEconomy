package com.kryeit.kryeiteconomy.Client;

import com.kryeit.kryeiteconomy.KryeitEconomy;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.ClientRegistry;

public final class KeyInit {
    public static KeyMapping openGuiKey;

    private KeyInit() {
    }

    public static void init() {
        openGuiKey = registerKey("mission_gui", KeyMapping.CATEGORY_GAMEPLAY, InputConstants.KEY_H);
    }

    private static KeyMapping registerKey(String name, String category, int keycode) {
        final var key = new KeyMapping("key." + KryeitEconomy.ID + "." + name, keycode, category);
        ClientRegistry.registerKeyBinding(key);
        return key;
    }
}

