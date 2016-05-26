package xyz.bluerobot.gtextadventure.printable;

import xyz.bluerobot.gtextadventure.io.InputHandler;
import xyz.bluerobot.gtextadventure.io.OutputHandler;
import xyz.bluerobot.gtextadventure.printable.scene.Scene;

public class ScenePrintable implements Printable {
    private Scene scene;
    private String nextPrintableId;

    public ScenePrintable(Scene scene, String nextPrintableId) {
        this.nextPrintableId = nextPrintableId;
        this.scene = scene;
    }

    public String print(InputHandler inputHandler, OutputHandler outputHandler) {
        scene.executeScene(inputHandler, outputHandler);
        return nextPrintableId;
    }
}
