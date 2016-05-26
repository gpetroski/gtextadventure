package xyz.bluerobot.gtextadventure.printable.location.noun;

import xyz.bluerobot.gtextadventure.io.OutputHandler;
import xyz.bluerobot.gtextadventure.printable.location.verb.Verb;
import xyz.bluerobot.gtextadventure.printable.location.verb.handler.VerbHandler;

import java.util.List;
import java.util.Map;

public abstract class Noun {
    private String id;
    private String name;
    private String description;
    private Map<Verb, VerbHandler> verbHandlers;
    private boolean visible;

    public Noun(String id, String name, String description, Map<Verb, VerbHandler> verbHandlers, boolean visible) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.verbHandlers = verbHandlers;
        this.visible = visible;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Map<Verb, VerbHandler> getVerbHandlers() {
        return verbHandlers;
    }

    public boolean isVisible() {
        return visible;
    }

    public boolean isMatch(List<String> words) {
        return words.contains(name.toLowerCase().trim());
    }

    public void performVerb(Verb verb, OutputHandler outputHandler) {
        VerbHandler verbHandler = verbHandlers.get(verb);
        verbHandler.performVerb(this, outputHandler);
    }
}
