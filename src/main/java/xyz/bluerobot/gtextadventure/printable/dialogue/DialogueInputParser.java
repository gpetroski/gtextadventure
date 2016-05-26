package xyz.bluerobot.gtextadventure.printable.dialogue;

import java.util.List;

public class DialogueInputParser {

    public DialogueOption determineNextDialogueOption(List<String> input, List<DialogueOption> options) {
        return options.get(0);
    }
}
