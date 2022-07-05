package github.qe7.client.module.impl.movement;

import github.qe7.client.ShaeHack;
import github.qe7.client.event.Event;
import github.qe7.client.module.Category;
import github.qe7.client.module.Module;
import github.qe7.client.util.entity.Player;
import org.lwjgl.input.Keyboard;

public class Fly extends Module {

    private final Player player = new Player();

    public Fly() {
        super("Flight", Keyboard.KEY_Z, Category.MOVEMENT);
    }

    public void onEnable() {
        ShaeHack.i.getMinecraft().thePlayer.motionY += 0.04d;
    }

    public void onEvent(Event event) {
        if (ShaeHack.i.getMinecraft().thePlayer.moveForward != 0 || ShaeHack.i.getMinecraft().thePlayer.moveStrafing != 0)
            player.setSpeed(0.18D);
        ShaeHack.i.getMinecraft().thePlayer.motionY = 0.001d;
    }

}
