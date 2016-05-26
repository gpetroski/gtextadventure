package xyz.bluerobot.gtextadventure.printable.location.verb;

import java.util.HashSet;
import java.util.Set;

public class AcquireVerb extends Verb {
    private static final String ID = "ACQUIRE";
    private static final Set<String> MATCHING_WORDS = new HashSet<String>();

    static {
        MATCHING_WORDS.add("pick");
        MATCHING_WORDS.add("acquire");
        MATCHING_WORDS.add("lift");
        MATCHING_WORDS.add("carry");
        MATCHING_WORDS.add("take");
        MATCHING_WORDS.add("grab");
    }

    public AcquireVerb() {
        super(ID, MATCHING_WORDS);
    }

    public AcquireVerb(Set<String> matchingWords) {
        super(ID, matchingWords);
    }
}
