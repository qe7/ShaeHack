package github.qe7.client.module.impl.combat;

import github.qe7.client.ShaeHack;
import github.qe7.client.event.Event;
import github.qe7.client.event.impl.EventUpdate;
import github.qe7.client.module.Category;
import github.qe7.client.module.Module;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityAnimal;
import net.minecraft.src.EntityMob;
import net.minecraft.src.EntityPlayer;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ForceField extends Module {

    public static Entity target;

    public ForceField() {
        super("ForceField", Keyboard.KEY_R, Category.COMBAT);
    }

    public void onEvent(Event event) {
        if (event instanceof EventUpdate) {
            List entities = ShaeHack.i.getMinecraft().theWorld.getLoadedEntityList();
            for (int i = 0; i < entities.size(); i++) {
                if((entities.get(i) instanceof EntityPlayer || entities.get(i) instanceof EntityAnimal || entities.get(i) instanceof EntityMob) && entities.get(i) != ShaeHack.i.getMinecraft().thePlayer) {
                    if (ShaeHack.i.getMinecraft().thePlayer.getDistanceToEntity((Entity) entities.get(i)) <= 6) {
                        ShaeHack.i.getMinecraft().playerController.attackEntity(ShaeHack.i.getMinecraft().thePlayer, (Entity) entities.get(i));
                    }
                }
            }
        }
    }

}
