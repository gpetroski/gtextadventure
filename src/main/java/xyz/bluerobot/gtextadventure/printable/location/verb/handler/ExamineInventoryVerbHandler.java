package xyz.bluerobot.gtextadventure.printable.location.verb.handler;

import xyz.bluerobot.gtextadventure.io.OutputHandler;
import xyz.bluerobot.gtextadventure.game.player.Inventory;

public class ExamineInventoryVerbHandler implements VerbHandler<Inventory> {
    public void performVerb(Inventory noun, OutputHandler outputHandler) {
        noun.describeInventory(outputHandler);
    }
}
