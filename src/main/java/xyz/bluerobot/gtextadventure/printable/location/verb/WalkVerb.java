package xyz.bluerobot.gtextadventure.printable.location.verb;

import java.util.HashSet;
import java.util.Set;

public class WalkVerb extends Verb {
    private static final String ID = "WALK";
    private static final Set<String> MATCHING_WORDS = new HashSet<String>();

    static {
        MATCHING_WORDS.add("move");
        MATCHING_WORDS.add("go");
        MATCHING_WORDS.add("walk");
        MATCHING_WORDS.add("run");
    }

    public WalkVerb() {
        super(ID, MATCHING_WORDS);
    }

    public WalkVerb(Set<String> matchingWords) {
        super(ID, matchingWords);
    }
}
