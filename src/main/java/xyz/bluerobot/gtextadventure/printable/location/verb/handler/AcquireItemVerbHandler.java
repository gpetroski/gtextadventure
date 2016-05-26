package xyz.bluerobot.gtextadventure.printable.location.verb.handler;

import xyz.bluerobot.gtextadventure.io.OutputHandler;
import xyz.bluerobot.gtextadventure.printable.location.noun.Item;

public class AcquireItemVerbHandler implements VerbHandler<Item> {
    public void performVerb(Item noun, OutputHandler outputHandler) {
        noun.addToInventory();
    }
}
