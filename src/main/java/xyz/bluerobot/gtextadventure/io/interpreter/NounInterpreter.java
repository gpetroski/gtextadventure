package xyz.bluerobot.gtextadventure.io.interpreter;

import xyz.bluerobot.gtextadventure.printable.location.noun.Noun;

import java.util.ArrayList;
import java.util.List;

public class NounInterpreter<T extends Noun> implements InputInterpreter<T> {

    public List<T> interpretInput(List<String> input, List<T> possibleValues) {
        List<T> matchingNouns = new ArrayList<T>();
        for (T noun : possibleValues) {
            if (noun.isMatch(input)) {
                matchingNouns.add(noun);
            }
        }
        return matchingNouns;
    }
}
