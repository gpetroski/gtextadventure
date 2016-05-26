package xyz.bluerobot.gtextadventure.printable.location.verb;

import java.util.List;
import java.util.Set;

public class Verb {
    private final String id;
    private final Set<String> matchingWords;

    public Verb(final String id, final Set<String> matchingWords) {
        this.id = id;
        this.matchingWords = matchingWords;
    }

    public String getId() {
        return id;
    }

    public Set<String> getMatchingWords() {
        return matchingWords;
    }

    public boolean isMatch(List<String> words) {
        for (String word : words) {
            if (matchingWords.contains(word.toLowerCase().trim())) {
                return true;
            }
        }
        return false;
    }
}
