package xyz.bluerobot.gtextadventure.printable.location.noun;

import xyz.bluerobot.gtextadventure.game.player.Inventory;
import xyz.bluerobot.gtextadventure.printable.location.verb.Verb;
import xyz.bluerobot.gtextadventure.printable.location.verb.handler.VerbHandler;

import java.util.Map;

public class Item extends Noun {
    private Inventory inventory;

    public Item(String id, String name, String description, Map<Verb, VerbHandler> verbHandlers, boolean visible, Inventory inventory) {
        super(id, name, description, verbHandlers, visible);
        this.inventory = inventory;
    }

    public void addToInventory() {
        inventory.addToInventory(this);
    }
}
