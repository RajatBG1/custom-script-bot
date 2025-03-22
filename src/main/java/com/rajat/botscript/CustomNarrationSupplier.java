package com.rajat.botscript;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.NarratorManager;

public class CustomNarrationSupplier {

    private final Screen screen;

    public CustomNarrationSupplier(Screen screen) {
        this.screen = screen;
    }

    public void supply() {
        try {
            NarratorManager narratorManager = MinecraftClient.getInstance().getNarratorManager();
            narratorManager.narrate(screen.getTitle().getString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}