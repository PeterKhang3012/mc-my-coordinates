package Minecraft.Mod.Test.client;
import dev.peter.mc.mycoordinates.HUD.RenderCoordinate;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class UntitledClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HudRenderCallback.EVENT.register(new RenderCoordinate());
    }
}
