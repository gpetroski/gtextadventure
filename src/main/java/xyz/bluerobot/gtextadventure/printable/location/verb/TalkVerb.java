package xyz.bluerobot.gtextadventure.printable.location.verb;

import java.util.HashSet;
import java.util.Set;

public class TalkVerb extends Verb {
    private static final String ID = "TALK";
    private static final Set<String> MATCHING_WORDS = new HashSet<String>();

    static {
        MATCHING_WORDS.add("talk");
        MATCHING_WORDS.add("speak");
        MATCHING_WORDS.add("say");
        MATCHING_WORDS.add("converse");
    }

    public TalkVerb() {
        super(ID, MATCHING_WORDS);
    }

    public TalkVerb(Set<String> matchingWords) {
        super(ID, matchingWords);
    }
}