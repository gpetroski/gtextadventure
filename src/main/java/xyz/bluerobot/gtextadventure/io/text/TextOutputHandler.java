package xyz.bluerobot.gtextadventure.io.text;

import xyz.bluerobot.gtextadventure.io.OutputHandler;

public class TextOutputHandler implements OutputHandler {
    public void sendOutput(String output) {
        System.out.println(output);
    }
}
