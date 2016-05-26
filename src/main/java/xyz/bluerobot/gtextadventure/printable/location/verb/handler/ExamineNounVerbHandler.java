package xyz.bluerobot.gtextadventure.printable.location.verb.handler;

import xyz.bluerobot.gtextadventure.io.OutputHandler;
import xyz.bluerobot.gtextadventure.printable.location.noun.Noun;

public class ExamineNounVerbHandler implements VerbHandler<Noun> {
    public void performVerb(Noun noun, OutputHandler outputHandler) {
        outputHandler.sendOutput(noun.getDescription());
    }
}
