package github.qe7.client.module.impl.movement;

import github.qe7.client.ShaeHack;
import github.qe7.client.event.Event;
import github.qe7.client.module.Category;
import github.qe7.client.module.Module;
import org.lwjgl.input.Keyboard;

public class Step extends Module {

    public Step() {
        super("Step", Keyboard.KEY_H, Category.MOVEMENT);
    }

    public void onEnable() {
        ShaeHack.i.getMinecraft().thePlayer.stepHeight = 1.f;
    }

    public void onDisable() {
        ShaeHack.i.getMinecraft().thePlayer.stepHeight = .5f;
    }

    public void onEvent(Event event) {
        ShaeHack.i.getMinecraft().thePlayer.stepHeight = 1.f;
    }
}
