package com.rajat.botscript;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.client.gui.DrawContext; // Correct import for DrawContext

public class ScriptGui extends Screen {

    protected ScriptGui(Screen parent) {
        super(Text.of("Script GUI"));
    }

    public static ScriptGui create(Screen parent) {
        return new ScriptGui(parent);
    }

    @Override
    protected void init() {
        super.init();
        // Initialize GUI components
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context, mouseX, mouseY, delta);
        // Render GUI components
        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
        // Custom background rendering logic
        super.renderBackground(context, mouseX, mouseY, delta);
    }

    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }
}