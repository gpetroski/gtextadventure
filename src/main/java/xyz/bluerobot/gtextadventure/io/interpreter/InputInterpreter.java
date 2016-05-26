package xyz.bluerobot.gtextadventure.io.interpreter;

import java.util.List;

public interface InputInterpreter<T> {

    List<T> interpretInput(List<String> input, List<T> possibleValues);
}
