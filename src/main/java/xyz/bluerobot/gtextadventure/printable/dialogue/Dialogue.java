package xyz.bluerobot.gtextadventure.printable.dialogue;

import xyz.bluerobot.gtextadventure.io.InputHandler;
import xyz.bluerobot.gtextadventure.io.OutputHandler;
import xyz.bluerobot.gtextadventure.printable.Printable;

import java.util.List;

public class Dialogue implements Printable {
    private String id;
    private String dialogueOutput;
    private List<DialogueOption> dialogueOptions;
    private DialogueInputParser dialogueInputParser;

    public Dialogue(String id, String dialogueOutput, List<DialogueOption> dialogueOptions, DialogueInputParser dialogueInputParser) {
        this.id = id;
        this.dialogueOutput = dialogueOutput;
        this.dialogueOptions = dialogueOptions;
        this.dialogueInputParser = dialogueInputParser;
    }

    public String print(InputHandler inputHandler, OutputHandler outputHandler) {
        outputHandler.sendOutput(dialogueOutput);

        List<String> input = inputHandler.getInput();
        DialogueOption option = dialogueInputParser.determineNextDialogueOption(input, dialogueOptions);

        outputHandler.sendOutput(option.getOutput());

        return option.getNextPrintableId();
    }

    public String getId() {
        return id;
    }
}
