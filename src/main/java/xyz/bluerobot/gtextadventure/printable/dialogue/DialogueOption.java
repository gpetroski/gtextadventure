package xyz.bluerobot.gtextadventure.printable.dialogue;

public class DialogueOption {
    private String output;
    private String nextPrintableId;

    public DialogueOption(String output, String nextPrintableId) {
        this.output = output;
        this.nextPrintableId = nextPrintableId;
    }

    public String getOutput() {
        return output;
    }

    public String getNextPrintableId() {
        return nextPrintableId;
    }
}
