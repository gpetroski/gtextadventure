package xyz.bluerobot.gtextadventure.printable.location.verb.handler;

import xyz.bluerobot.gtextadventure.io.OutputHandler;
import xyz.bluerobot.gtextadventure.printable.location.noun.Container;

public class UseContainerVerbHandler implements VerbHandler<Container> {
    public void performVerb(Container noun, OutputHandler outputHandler) {
        outputHandler.sendOutput(noun.toggleClosed());
    }
}
