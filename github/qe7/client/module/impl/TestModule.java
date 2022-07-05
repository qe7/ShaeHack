package github.qe7.client.module.impl;

import github.qe7.client.event.Event;
import github.qe7.client.event.impl.EventUpdate;
import github.qe7.client.module.Category;
import github.qe7.client.module.Module;
import github.qe7.client.util.chat.Chat;
import org.lwjgl.input.Keyboard;

public class TestModule extends Module {

    private final Chat chat = new Chat();

    public TestModule() {
        super("TestModule", Keyboard.KEY_G, Category.MISC);
    }

    public void onEvent(Event event) {
        if (event instanceof EventUpdate) {
            chat.AddChatMessage("Event : Update");
        }
    }

}
