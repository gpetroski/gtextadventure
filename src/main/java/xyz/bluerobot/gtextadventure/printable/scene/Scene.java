package xyz.bluerobot.gtextadventure.printable.scene;

import xyz.bluerobot.gtextadventure.io.InputHandler;
import xyz.bluerobot.gtextadventure.io.OutputHandler;
import xyz.bluerobot.gtextadventure.printable.Printable;

import java.util.List;

public class Scene implements Printable {
    private String id;
    private List<SceneItem> sceneItems;
    private String nextPrintableId;

    public Scene(String id, List<SceneItem> sceneItems, String nextPrintableId) {
        this.id = id;
        this.sceneItems = sceneItems;
        this.nextPrintableId = nextPrintableId;
    }

    public String print(InputHandler inputHandler, OutputHandler outputHandler) {
        for (SceneItem sceneItem : sceneItems) {
            outputHandler.sendOutput(sceneItem.getOutput());
            try {
                Thread.sleep(sceneItem.getDelay());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return nextPrintableId;
    }

    public String getId() {
        return id;
    }
}
