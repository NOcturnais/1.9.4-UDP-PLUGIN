package fr.noctu;

import party.detection.unknown.plugin.KeyPlugin;
import party.detection.unknown.plugin.annotations.Plugin;
import party.detection.unknown.plugin.annotations.PluginGroup;
import party.detection.unknown.util.Keyboard;

@PluginGroup("OOF") // Only one plugin in your workspace needs to have this annotation
@Plugin(
        name = "HookTest",
        description = "oof",
        author = "NOctu",
        versions = {"1.9.4"}
)
public class HookTest extends KeyPlugin.Toggle {
    public HookTest(){
        setKey(Keyboard.KEY_O);
    }

    public void runHook(){
        System.out.println("OOOOOf");
    }
}
