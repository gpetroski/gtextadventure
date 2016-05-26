package xyz.bluerobot.gtextadventure.io.text;

import org.apache.commons.lang.StringUtils;
import xyz.bluerobot.gtextadventure.io.InputHandler;

import java.util.*;

public class TextInputHandler implements InputHandler {
    private Scanner scanner = new Scanner(System.in);

    public List<String> getInput() {
        return tokenizeWords(scanner.nextLine());
    }

    private List<String> tokenizeWords(String words) {
        List<String> wordList = new ArrayList<String>();
        if (StringUtils.isNotBlank(words)) {
            StringTokenizer tokenizer = new StringTokenizer(words, " ");
            while (tokenizer.hasMoreTokens()) {
                wordList.add(tokenizer.nextToken().toLowerCase());
            }
        }
        return wordList;
    }
}
