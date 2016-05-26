package xyz.bluerobot.gtextadventure.printable.location.noun;

import xyz.bluerobot.gtextadventure.printable.location.Direction;
import xyz.bluerobot.gtextadventure.printable.location.verb.Verb;
import xyz.bluerobot.gtextadventure.printable.location.verb.handler.VerbHandler;

import java.util.Map;

public class Exit extends Noun {
    private String nextPrintableId;
    private Direction direction;
    private boolean locked;

    public Exit(String id, String name, String description, Map<Verb, VerbHandler> verbHandlers, boolean visible) {
        super(id, name, description, verbHandlers, visible);
    }
}
