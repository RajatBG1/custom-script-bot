package com.rajat.botscript;

import net.fabricmc.api.ClientModInitializer;

public class BotScriptClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Bot Script Client Initialized!");
    }
}
