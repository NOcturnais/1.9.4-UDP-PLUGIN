package fr.noctu;

import party.detection.unknown.event.EventListener;
import party.detection.unknown.event.impl.external.PreMotionUpdateEvent;
import party.detection.unknown.hook.impl.Wrapper;
import party.detection.unknown.plugin.KeyPlugin;
import party.detection.unknown.plugin.annotations.Plugin;

@Plugin(
        name = "Highjump",
        description = "highjump",
        author = "NOctu",
        versions = {"1.9.4"}
)
public class Highjump extends KeyPlugin.Toggle {
    @EventListener
    public void onMotion(PreMotionUpdateEvent e){
        boolean up = Wrapper.getSettings().getKeyJump().isPressed();
        if(up)
            Wrapper.getPlayer().setMotionY(2);
    }
}
