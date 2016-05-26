package xyz.bluerobot.gtextadventure.game.player;

import xyz.bluerobot.gtextadventure.io.OutputHandler;
import xyz.bluerobot.gtextadventure.printable.location.noun.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items = new ArrayList<Item>();

    public Inventory() {
    }

    public List<Item> getItems() {
        return items;
    }

    public void addToInventory(Item item) {
        items.add(item);
    }

    public void describeInventory(OutputHandler outputHandler) {
        for (Item item : items) {
            outputHandler.sendOutput(item.getDescription());
        }
    }
}
