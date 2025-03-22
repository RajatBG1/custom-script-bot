package com.rajat.botscript.mixin;

import com.rajat.botscript.CustomNarrationSupplier;
import com.rajat.botscript.ScriptGui;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Screen.class)
public class ScreenMixin {

    @Shadow
    private MinecraftClient client;

    @Inject(method = "init", at = @At("HEAD"))
    public void init(CallbackInfo info) {
        if (this.client.world != null) {
            this.client.setScreen(ScriptGui.create((Screen) (Object) this));
        }
    }

    @Inject(method = "render", at = @At("HEAD"))
    public void render(CallbackInfo info) {
        new CustomNarrationSupplier((Screen) (Object) this).supply();
    }
}