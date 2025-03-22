package com.rajat.botscript;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;

public class ScriptGui extends Screen {
    protected ScriptGui() {
        super(Text.of("Script GUI"));
    }

    @Override
    protected void init() {
        this.addDrawableChild(new CustomButton(10, 10, 100, 20, Text.of("Click Me")));
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
    }

    // Fix for protected ButtonWidget constructor
    static class CustomButton extends ButtonWidget {
        public CustomButton(int x, int y, int width, int height, Text message) {
            super(x, y, width, height, message, button -> System.out.println("Button Clicked!"),
                    (button) -> Text.literal("Button Tooltip") // Changed to `Text.literal()` (MutableText)
            );
        }
    }
}
