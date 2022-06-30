package github.qe7.client.module;

public enum Category {

    COMBAT("Combat"),
    RENDER("Render"),
    MOVEMENT("Movement"),
    PLAYER("Player"),
    MISC("Misc"),
    EXPLOIT("Exploit");

    final String name;

    Category(String name) {
        this.name = name;
    }

}
