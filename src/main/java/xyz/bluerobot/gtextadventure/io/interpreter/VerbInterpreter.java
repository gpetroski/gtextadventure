package xyz.bluerobot.gtextadventure.io.interpreter;

import xyz.bluerobot.gtextadventure.printable.location.verb.Verb;

import java.util.ArrayList;
import java.util.List;

public class VerbInterpreter implements InputInterpreter<Verb> {

    public List<Verb> interpretInput(List<String> input, List<Verb> possibleValues) {
        List<Verb> matchingVerbs = new ArrayList<Verb>();
        for (Verb verb : possibleValues) {
            if (verb.isMatch(input)) {
                matchingVerbs.add(verb);
            }
        }
        return matchingVerbs;
    }
}
