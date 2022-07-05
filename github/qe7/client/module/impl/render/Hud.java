package github.qe7.client.module.impl.render;

import github.qe7.client.ShaeHack;
import github.qe7.client.event.Event;
import github.qe7.client.event.impl.EventRender2D;
import github.qe7.client.module.Category;
import github.qe7.client.module.Module;
import github.qe7.client.util.chat.Chat;
import net.minecraft.src.FontRenderer;
import net.minecraft.src.ScaledResolution;

import java.util.concurrent.CopyOnWriteArrayList;

public class Hud extends Module {

    private final Chat chat = new Chat();

    public Hud() {
        super("Hud", 0, Category.RENDER);
        setState(true);
    }

    public void onEvent(Event event) {
        CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<>(ShaeHack.i.getModuleManager().getModules());
        FontRenderer fr = ShaeHack.i.getMinecraft().fontRenderer;
        ScaledResolution sr = new ScaledResolution(ShaeHack.i.getMinecraft().gameSettings, ShaeHack.i.getMinecraft().displayWidth, ShaeHack.i.getMinecraft().displayHeight);
        int count = 0;

        if (event instanceof EventRender2D) {
            ShaeHack.i.getMinecraft().fontRenderer.drawStringWithShadow("Shae" + chat.getBlue() + "Hack " + ShaeHack.i.getClientVersion(), 4, 4, -1);
            ShaeHack.i.getMinecraft().fontRenderer.drawStringWithShadow("Welcome " + chat.getBlue() + ShaeHack.i.getClientUser() + chat.getWhite() + "!", 4, 14, -1);

            int X = (int) ShaeHack.i.getMinecraft().thePlayer.posX;
            int Y = (int) ShaeHack.i.getMinecraft().thePlayer.posY;
            int Z = (int) ShaeHack.i.getMinecraft().thePlayer.posZ;

            if(ShaeHack.i.getMinecraft().thePlayer.dimension == -1) {
                fr.drawStringWithShadow("OverWorld: " + X*8 + ", " + Y + ", " + Z*8, 4, sr.getScaledHeight() - 10, -1);
                fr.drawStringWithShadow("Nether: " + X +", " + Y + ", " + Z,4, sr.getScaledHeight() - 20, -1);
            }else {
                fr.drawStringWithShadow("OverWorld: " + X + ", " + Y + ", " + Z, 4, sr.getScaledHeight() - 10, -1);
                fr.drawStringWithShadow("Nether: " + X/8 + ", " + Y + ", " + Z/8,4, sr.getScaledHeight() - 20, -1);
            }

            for (Module m : modules) {
                if (m.isState()) {
                    fr.drawStringWithShadow(m.getName(), 4, 24 + (10 * count), -1);
                    count++;
                }
            }
        }
    }

}
