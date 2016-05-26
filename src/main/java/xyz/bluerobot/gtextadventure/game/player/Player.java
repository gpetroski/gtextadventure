package xyz.bluerobot.gtextadventure.game.player;

public class Player {
    private static final Player PLAYER = new Player();
    private Inventory inventory = new Inventory();

    protected Player() {
    }

    public Inventory getInventory() {
        return inventory;
    }

    public static Player getPlayer() {
        return PLAYER;
    }
}
