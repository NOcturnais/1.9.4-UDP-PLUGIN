package fr.noctu;

import party.detection.unknown.event.EventListener;
import party.detection.unknown.event.impl.external.GuiRenderEvent;
import party.detection.unknown.hook.impl.FontRenderer;
import party.detection.unknown.hook.impl.Wrapper;
import party.detection.unknown.plugin.ActivePlugin;
import party.detection.unknown.plugin.KeyPlugin;
import party.detection.unknown.plugin.PluginManager;
import party.detection.unknown.plugin.PluginPack;
import party.detection.unknown.plugin.annotations.Plugin;

@Plugin(
        name = "HUD",
        description = "shitty hud",
        author = "NOctu",
        versions = {"1.9.4"}
)
public class HUD extends ActivePlugin.Startup {
    @EventListener
    public void onRender(GuiRenderEvent e) {
        int y = 2;
        FontRenderer fr = Wrapper.getMinecraft().getFontRenderer();
        fr.drawStringWithShadow("OOF CLIENT", 3, 4, -1);
        for (PluginPack p : PluginManager.INSTANCE.getPlugins()) {
            for (PluginPack.PluginClass c : p.getClasses()) {
                Object inst = c.getInstance();
                if (inst instanceof KeyPlugin) {
                    KeyPlugin plugin = (KeyPlugin) inst;
                    String text = c.getName();
                    int x = 3;
                    if (plugin.isEnabled()) {
                        fr.drawString(text, x, y, -1, true);
                        y+= 12;
                    }
                }
            }
        }
    }
}
