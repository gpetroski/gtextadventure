package xyz.bluerobot.gtextadventure.printable.location.verb;

import java.util.HashSet;
import java.util.Set;

public class UseVerb extends Verb {
    private static final String ID = "USE";
    private static final Set<String> MATCHING_WORDS = new HashSet<String>();

    static {
        MATCHING_WORDS.add("use");
        MATCHING_WORDS.add("open");
        MATCHING_WORDS.add("close");
        MATCHING_WORDS.add("put");
        MATCHING_WORDS.add("push");
        MATCHING_WORDS.add("pull");
        MATCHING_WORDS.add("turn");
    }

    public UseVerb() {
        super(ID, MATCHING_WORDS);
    }

    public UseVerb(Set<String> matchingWords) {
        super(ID, matchingWords);
    }
}
