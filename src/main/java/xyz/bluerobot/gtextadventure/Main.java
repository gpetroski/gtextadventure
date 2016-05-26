package xyz.bluerobot.gtextadventure;

import xyz.bluerobot.gtextadventure.printable.location.Location;
import xyz.bluerobot.gtextadventure.printable.location.noun.Container;
import xyz.bluerobot.gtextadventure.printable.location.noun.Item;
import xyz.bluerobot.gtextadventure.printable.location.noun.Noun;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Item key = new Item();

        Container redBox = new Container("box", "Red Box", "A small tin red box.", );

        List<Noun> nouns = new ArrayList<Noun>();


        Location location = new Location("Room",
                "You are in a room. You see a red box on the floor, a door to your left, and a note on a desk.",
                );
    }
}
