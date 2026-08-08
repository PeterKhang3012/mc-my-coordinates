package dev.peter.mc.mycoordinates.HUD;
import dev.peter.mc.mycoordinates.Player.PlayerCoordinates;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;

public class RenderCoordinate implements HudRenderCallback {
    private final PlayerCoordinates coordinate = new PlayerCoordinates();
    @Override
    public void onHudRender(DrawContext drawContext, RenderTickCounter tickDelta) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null && client.player != null){
            coordinate.updatePosition();
            TextRenderer textRenderer = client.textRenderer;
            String coordinates =String.format("X: %.1f, Y: %.1f, Z: %.1f", coordinate.getX(), coordinate.getY(), coordinate.getZ());
            int x = 1;
            int y = 1;
            int color = 0xFFFFFFFF;

            drawContext.drawText(textRenderer, coordinates, x, y, color, true);
        }
    }
}
