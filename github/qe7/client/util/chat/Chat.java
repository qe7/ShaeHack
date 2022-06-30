package github.qe7.client.util.chat;

import github.qe7.client.ShaeHack;

public class Chat {

    private final String
            red = "§c",
            darkRed = "§4",
            yellow = "§e",
            gold = "§6",
            green = "§a",
            darkGreen = "§2",
            aqua = "§b",
            darkAqua = "§3",
            blue = "§9",
            darkBlue = "§1",
            purple = "§d",
            darkPurple = "§5",
            white = "§f",
            gray = "§7",
            darkGray = "§8",
            black = "§0";

    public void AddChatMessage(String string) {
        ShaeHack.i.getMinecraft().thePlayer.addChatMessage(gray + "[" + white + "Shae" + blue + "Hack" + gray + "] " + string + ".");
    }

    public String getRed() {
        return red;
    }

    public String getDarkRed() {
        return darkRed;
    }

    public String getYellow() {
        return yellow;
    }

    public String getGold() {
        return gold;
    }

    public String getGreen() {
        return green;
    }

    public String getDarkGreen() {
        return darkGreen;
    }

    public String getAqua() {
        return aqua;
    }

    public String getDarkAqua() {
        return darkAqua;
    }

    public String getBlue() {
        return blue;
    }

    public String getDarkBlue() {
        return darkBlue;
    }

    public String getPurple() {
        return purple;
    }

    public String getDarkPurple() {
        return darkPurple;
    }

    public String getWhite() {
        return white;
    }

    public String getGray() {
        return gray;
    }

    public String getDarkGray() {
        return darkGray;
    }

    public String getBlack() {
        return black;
    }
}
