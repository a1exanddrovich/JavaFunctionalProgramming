package com.stepik.course.tasks.t7_1;

import java.util.ArrayList;
import java.util.List;

public class App {

    private final List<Command> commands;

    public App() {
        commands = new ArrayList<>();
    }

    public void add(Command command) {
        commands.add(command);
    }

    public void run() {
        for (Command command : commands) {
            command.execute();
        }
    }

}
