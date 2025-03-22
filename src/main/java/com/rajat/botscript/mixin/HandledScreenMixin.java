package com.rajat.botscript.mixin;

import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HandledScreen.class)
public abstract class HandledScreenMixin extends Screen {
    protected HandledScreenMixin(Text title) {
        super(title);
    }

    @Inject(method = "init", at = @At("TAIL"))
    private void addCustomButton(CallbackInfo info) {
        ClickableWidget myButton = new ClickableWidget(10, 10, 100, 20, Text.of("Click Me")) {
            @Override
            public void onClick(double mouseX, double mouseY) {
                System.out.println("Button Clicked!");
            }

            @Override
            public void appendClickableNarrations(net.minecraft.client.gui.screen.narration.NarrationMessageBuilder builder) {
                builder.put(net.minecraft.client.gui.screen.narration.NarrationPart.HINT, Text.of("Custom Button"));
            }

            @Override
            public void renderWidget(DrawContext context, int mouseX, int mouseY, float delta) {
                context.drawText(textRenderer, this.getMessage(), this.getX() + 5, this.getY() + 5, 0xFFFFFF, true);
            }
        };

        this.addDrawableChild(myButton);
    }
}
