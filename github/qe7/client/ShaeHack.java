package github.qe7.client;

import github.qe7.client.util.console.Console;
import net.minecraft.client.Minecraft;

public class ShaeHack {

    public static ShaeHack i = new ShaeHack();
    private final String clientName = "ShaeHack", clientVersion = "v1.0.0", clientUser = "Shae";
    private final Minecraft minecraft = Minecraft.getMinecraft();
    private final Console console = new Console();
    private boolean devBuild;

    public String getClientName() {
        return clientName;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public Minecraft getMinecraft() {
        return minecraft;
    }

    public void initialize() {
        console.AddConsoleMessage("Injected '" + getClientName() + "'.\n");

        if (clientName.equalsIgnoreCase("Shae")) {
            devBuild = true;
        } else {
            devBuild = false;
        }
    }

}
