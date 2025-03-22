package com.rajat.botscript;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.NarratorManager;

public class CustomNarrationSupplier implements NarratorManager.NarrationSupplier {

    private final Screen screen;

    public CustomNarrationSupplier(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void supply(NarratorManager.Narration narration) {
        // Custom narration logic
        narration.add(NarratorManager.NarrationPriority.DEFAULT, screen.getTitle().getString());
    }
}