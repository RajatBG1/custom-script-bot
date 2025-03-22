package com.rajat.botscript;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.screen.slot.SlotActionType;

public class ActionHandler {
    private static final MinecraftClient client = MinecraftClient.getInstance();

    public static void rightClick() {
        if (client.player != null) {
            client.interactionManager.interactItem(client.player, client.player.getActiveHand());
        }
    }

    public static void guiClick(String itemName) {
        if (client.player != null && client.currentScreen != null) {
            for (int i = 0; i < client.player.currentScreenHandler.slots.size(); i++) {
                if (client.player.currentScreenHandler.getSlot(i).getStack().getName().getString().equals(itemName)) {
                    client.interactionManager.clickSlot(
                            client.player.currentScreenHandler.syncId, i, 0, SlotActionType.PICKUP, client.player);
                    break;
                }
            }
        }
    }

    public static void moveRight(int steps) {
        if (client.player != null) {
            for (int i = 0; i < steps; i++) {
                client.player.setVelocity(0.1, 0, 0);  // Moves player right
                try { Thread.sleep(500); } catch (InterruptedException ignored) {}
            }
        }
    }
}
