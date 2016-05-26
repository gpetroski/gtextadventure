package xyz.bluerobot.gtextadventure.game;

import xyz.bluerobot.gtextadventure.io.InputHandler;
import xyz.bluerobot.gtextadventure.io.OutputHandler;

import java.util.List;

public class GameController {
    private Game game;
    private InputHandler inputHandler;
    private OutputHandler outputHandler;

    public GameController(Game game, InputHandler inputHandler, OutputHandler outputHandler) {
        this.game = game;
        this.inputHandler = inputHandler;
        this.outputHandler = outputHandler;
    }

    public void runGame() {
        game.start();
        game.print(outputHandler);

        while (game.isRunning()) {
            List<String> input = inputHandler.getInput();
            game.update(input);
            game.print(outputHandler);
        }
    }
}
