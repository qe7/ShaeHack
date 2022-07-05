package github.qe7.client;

import github.qe7.client.event.EventManager;
import github.qe7.client.module.ModuleManager;
import github.qe7.client.util.console.Console;
import net.minecraft.client.Minecraft;

public class ShaeHack {

    public static ShaeHack i = new ShaeHack();
    private String clientName = "ShaeHack", clientVersion = "v1.0.0", clientUser = "Test";
    private final Minecraft minecraft = Minecraft.getMinecraft();
    private final Console console = new Console();
    /* Managers [-- */
    private final EventManager eventManager = new EventManager();
    private final ModuleManager moduleManager = new ModuleManager();
    /* --] */
    private boolean devBuild;

    public String getClientName() {
        return clientName;
    }

    public String getClientUser() {
        return clientUser;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public Minecraft getMinecraft() {
        return minecraft;
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public ModuleManager getModuleManager() {
        return moduleManager;
    }

    public void initialize() {
        console.AddConsoleMessage("Injected '" + getClientName() + "'.\n");

        if (clientUser.equalsIgnoreCase("Shae")) {
            devBuild = true;
            clientVersion = clientVersion + "-developer";
        } else {
            devBuild = false;
        }

        moduleManager.initialize();
    }

}
