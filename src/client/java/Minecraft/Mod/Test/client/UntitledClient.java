package Minecraft.Mod.Test.client;
import dev.peter.mc.mycoordinates.HUD.RenderCoordinate;
import dev.peter.mc.quickping.client.keybind.QuickPingKeybind;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;


public class UntitledClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HudRenderCallback.EVENT.register(new RenderCoordinate());
        QuickPingKeybind.register();
    //Quick Ping
    ClientTickEvents.END_CLIENT_TICK.register(client -> {
        if (client.player == null) return;
        while(QuickPingKeybind.quickPing.wasPressed()){
            System.out.println("Quick Ping");
        }
    });
    }
}
