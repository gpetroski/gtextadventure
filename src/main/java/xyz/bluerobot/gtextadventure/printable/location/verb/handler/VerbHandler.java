package xyz.bluerobot.gtextadventure.printable.location.verb.handler;

import xyz.bluerobot.gtextadventure.io.OutputHandler;
import xyz.bluerobot.gtextadventure.printable.location.noun.Noun;

public interface VerbHandler<T extends Noun> {
    void performVerb(T noun, OutputHandler outputHandler);
}
