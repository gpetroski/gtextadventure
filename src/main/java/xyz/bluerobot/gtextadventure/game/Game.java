package xyz.bluerobot.gtextadventure.game;

import xyz.bluerobot.gtextadventure.game.player.Player;
import xyz.bluerobot.gtextadventure.io.OutputHandler;
import xyz.bluerobot.gtextadventure.io.interpreter.NounInterpreter;
import xyz.bluerobot.gtextadventure.io.interpreter.VerbInterpreter;
import xyz.bluerobot.gtextadventure.printable.Printable;
import xyz.bluerobot.gtextadventure.printable.location.noun.Item;
import xyz.bluerobot.gtextadventure.printable.location.noun.Noun;
import xyz.bluerobot.gtextadventure.printable.location.verb.Verb;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Game {
    private static final String NO_VERB_RESPONSE = "NO_VERB_RESPONSE";
    private String id;
    private VerbInterpreter verbInterpreter;
    private NounInterpreter nounInterpreter;
    private Map<String, Printable> printables;
    private Player player;
    private List<Verb> verbs;
    private Stack<Printable> currentPrintable = new Stack<Printable>();
    private boolean running = false;

    public Game(String id, Map<String, Printable> printables, Printable currentPrintable, List<Verb> verbs) {
        this.id = id;
        this.printables = printables;
        this.currentPrintable.add(currentPrintable);
        this.verbInterpreter = new VerbInterpreter();
        this.verbs = verbs;
        this.player = Player.getPlayer();
    }

    public void start() {
        running = true;
    }

    public void update(List<String> input) {
        List<Verb> matchingVerbs = verbInterpreter.interpretInput(input, verbs);

        if (matchingVerbs.size() == 0) {
            this.currentPrintable.add(printables.get(NO_VERB_RESPONSE));
        } else {
            // Determine item in inventory
            List<Item> matchingInventoryItems = nounInterpreter.interpretInput(input, player.getInventory().getItems());

            // Determine verb and action for a location

            // Determine dialogue option

            // Determine input for specific object
        }

    }

    public void print(OutputHandler outputHandler) {
        currentPrintable.peek().print(outputHandler);

        if (currentPrintable.size() > 1) {
            currentPrintable.pop();
        }
    }

    public boolean isRunning() {
        return running;
    }
}
