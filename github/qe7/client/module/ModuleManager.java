package github.qe7.client.module;

import com.sun.istack.internal.NotNull;
import github.qe7.client.module.impl.TestModule;
import github.qe7.client.module.impl.combat.ForceField;
import github.qe7.client.module.impl.movement.Fly;
import github.qe7.client.module.impl.movement.Step;
import github.qe7.client.module.impl.render.Hud;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ModuleManager {

    private static final CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<>();

    public void initialize() {
        /* Test */
        modules.add(new TestModule());

        /* Combat */
        modules.add(new ForceField());
        /* Exploit */
        /* Misc */
        /* Movement */
        modules.add(new Step());
        modules.add(new Fly());
        /* Player */
        /* Render */
        modules.add(new Hud());
    }

    public CopyOnWriteArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Module> getModulesByCategory(@NotNull Category c) throws IllegalArgumentException {
        ArrayList<Module> mods = new ArrayList<>();
        for (Module mod : modules) {
            if (mod.getCategory().equals(c)) {
                mods.add(mod);
            }
        }
        if (!mods.isEmpty()) {
            return mods;
        }
        throw new IllegalArgumentException();
    }

    public Module getModuleByName(@NotNull String name) throws IllegalArgumentException {
        for (Module module : modules)
            if (module.getName().equalsIgnoreCase(name)) {
                return module;
            }
        throw new IllegalArgumentException();
    }

}
