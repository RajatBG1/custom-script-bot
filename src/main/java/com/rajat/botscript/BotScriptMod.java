package com.rajat.botscript;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BotScriptMod implements ModInitializer {

	// Logger for debugging
	public static final Logger LOGGER = LoggerFactory.getLogger("botscriptmod");

	@Override
	public void onInitialize() {
		LOGGER.info("BotScriptMod has been initialized!");
	}
}