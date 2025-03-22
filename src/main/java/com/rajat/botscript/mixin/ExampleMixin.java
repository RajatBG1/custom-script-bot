package com.rajat.botscript.mixin;

import com.rajat.botscript.BotScriptMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "init")
	private void onInit(CallbackInfo info) {
		BotScriptMod.LOGGER.info("Bot Script Mod Mixin loaded!");
	}
}
