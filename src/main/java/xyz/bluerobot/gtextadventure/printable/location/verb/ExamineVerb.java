package xyz.bluerobot.gtextadventure.printable.location.verb;

import java.util.HashSet;
import java.util.Set;

public class ExamineVerb extends Verb {
    private static final String ID = "EXAMINE";
    private static final Set<String> MATCHING_WORDS = new HashSet<String>();

    static {
        MATCHING_WORDS.add("examine");
        MATCHING_WORDS.add("look");
        MATCHING_WORDS.add("investigate");
        MATCHING_WORDS.add("inspect");
        MATCHING_WORDS.add("read");
    }

    public ExamineVerb() {
        super(ID, MATCHING_WORDS);
    }

    public ExamineVerb(Set<String> matchingWords) {
        super(ID, matchingWords);
    }
}