package com.rajat.botscript;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class ScriptGui extends Screen {

    protected ScriptGui(Screen parent) {
        super(Text.of("Script GUI"));
    }

    @Override
    protected void init() {
        super.init();
        // Initialize GUI components
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        // Render GUI components
        super.render(matrices, mouseX, mouseY, delta);
    }

    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }
}