package com.rajat.botscript;

import net.minecraft.client.MinecraftClient;
import java.util.List;
import java.util.Arrays;

public class ScriptParser {
    private static final MinecraftClient client = MinecraftClient.getInstance();

    public static void execute(String scriptText) {
        List<String> lines = Arrays.asList(scriptText.split("\n"));

        for (String line : lines) {
            line = line.trim();
            if (line.startsWith("RightClick")) {
                ActionHandler.rightClick();
            } else if (line.startsWith(".guiClick")) {
                String itemName = line.replace(".guiClick ", "").trim();
                ActionHandler.guiClick(itemName);
            } else if (line.startsWith("MoveRight-")) {
                int steps = Integer.parseInt(line.replace("MoveRight-", "").trim());
                ActionHandler.moveRight(steps);
            } else if (line.startsWith("!loop")) {
                int loops = Integer.parseInt(line.replace("!loop ", "").trim());
                for (int i = 0; i < loops; i++) {
                    execute(scriptText);
                }
                break;
            }
        }
    }
}
