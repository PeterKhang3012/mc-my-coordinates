package dev.peter.mc.mycoordinates.Player;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;

public class PlayerCoordinates {
    public double x;
    public double y;
    public double z;
    public void updatePosition() {
        PlayerEntity player = MinecraftClient.getInstance().player;

        if (player != null) {
            this.x = player.getX();
            this.y = player.getY();
            this.z = player.getZ();
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String getPosition() {
        return "x" +  this.x + ", y" + this.y + ", z" + this.z;
    }
}
