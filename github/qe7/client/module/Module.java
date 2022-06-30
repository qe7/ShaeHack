package github.qe7.client.module;

import github.qe7.client.event.Event;

public class Module {

    public String name, suffix = "";
    public Category category;
    public boolean state;
    public int key;

    public Module(String name, int key, Category category) {
        this.name = name;
        this.category = category;
        this.key = key;
        this.suffix = suffix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void toggle() {
        state = !state;
        if (state) {
            onEnable();
        } else {
            onDisable();
        }
    }

    public void onEnable() {}
    public void onDisable() {}
    public void onEvent(Event event) {}
    public void onSkipEvent(Event event) {}

}
