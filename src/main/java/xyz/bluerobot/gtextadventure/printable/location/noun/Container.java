package xyz.bluerobot.gtextadventure.printable.location.noun;

import xyz.bluerobot.gtextadventure.printable.location.verb.Verb;
import xyz.bluerobot.gtextadventure.printable.location.verb.handler.VerbHandler;

import java.util.List;
import java.util.Map;

public class Container extends Noun {
    private boolean closed;
    private boolean locked;
    private List<Item> items;
    private String openDescription;
    private String closedDescription;
    private String lockedDescription;

    public Container(String id, String name, String description, Map<Verb, VerbHandler> verbHandlers,
                     List<Item> items, String openDescription, String closedDescription, String lockedDescription,
                     boolean visible, boolean closed, boolean locked) {
        super(id, name, description, verbHandlers, visible);
        this.closed = closed;
        this.items = items;
        this.locked = locked;
        this.lockedDescription = lockedDescription;
        this.openDescription = openDescription;
        this.closedDescription = closedDescription;
    }

    public String toggleClosed() {
        if (locked) {
            return lockedDescription;
        }
        closed = !closed;
        return closed ? closedDescription : openDescription;
    }

    public String toggleLocked() {
        locked = !locked;
        return toggleClosed();
    }


}
