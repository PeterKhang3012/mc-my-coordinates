package dev.peter.mc.quickping.client.keybind;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class QuickPingKeybind {
    public static KeyBinding quickPing;
     public static void register() {
         quickPing = KeyBindingHelper.registerKeyBinding(
                 new net.minecraft.client.option.KeyBinding(
                         "key.quickping.ping", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_Z, KeyBinding.Category.MISC
                 )
         );
     }
}
