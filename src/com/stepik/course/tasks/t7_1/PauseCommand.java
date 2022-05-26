package com.stepik.course.tasks.t7_1;

public class PauseCommand implements Command {

    private final Speaker speaker;

    public PauseCommand(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void execute() {
        speaker.pause();
    }
}
