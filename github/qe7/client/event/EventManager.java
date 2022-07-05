package github.qe7.client.event;

import github.qe7.client.ShaeHack;
import github.qe7.client.event.impl.EventKey;
import github.qe7.client.module.Module;

public class EventManager {

    public void onEvent(Event event) {
        if (event instanceof EventKey) {
            EventKey eventKey = (EventKey) event;
            for (Module module : ShaeHack.i.getModuleManager().getModules()) {
                if (module.getKey() == eventKey.getCode()) {
                    module.toggle();
                }
            }
        }
        for (Module module : ShaeHack.i.getModuleManager().getModules()) {
            if (module.isState()) {
                module.onEvent(event);
            }
            module.onSkipEvent(event);
        }
    }

}
