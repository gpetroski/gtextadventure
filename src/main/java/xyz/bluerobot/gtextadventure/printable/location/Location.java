package xyz.bluerobot.gtextadventure.printable.location;


import xyz.bluerobot.gtextadventure.io.InputHandler;
import xyz.bluerobot.gtextadventure.io.OutputHandler;
import xyz.bluerobot.gtextadventure.io.interpreter.NounInterpreter;
import xyz.bluerobot.gtextadventure.io.interpreter.VerbInterpreter;
import xyz.bluerobot.gtextadventure.printable.location.noun.Exit;
import xyz.bluerobot.gtextadventure.printable.location.noun.Noun;
import xyz.bluerobot.gtextadventure.printable.Printable;
import xyz.bluerobot.gtextadventure.printable.location.verb.Verb;

import java.util.List;
import java.util.Map;

public class Location implements Printable {
    private String id;
    private String description;
    private List<Noun> nouns;
    private List<Verb> verbs;
    private Map<Direction, Exit> exits;
    private NounInterpreter nounInterpreter;
    private VerbInterpreter verbParser;

    public Location(String id, String description, List<Noun> nouns, List<Verb> verbs, Map<Direction, Exit> exits,
                    NounInterpreter nounInterpreter, VerbInterpreter verbParser) {
        this.id = id;
        this.description = description;
        this.nouns = nouns;
        this.verbs = verbs;
        this.exits = exits;
        this.nounInterpreter = nounInterpreter;
        this.verbParser = verbParser;
    }

    public String print(InputHandler inputHandler, OutputHandler outputHandler) {
        outputHandler.sendOutput(description);

        List<String> input = inputHandler.getInput();
        Noun noun = nounInterpreter.determineNoun(input, nouns);
        Verb verb = verbParser.determineVerb(input, verbs);

        noun.performVerb(verb, outputHandler);

        return id;
    }
}
