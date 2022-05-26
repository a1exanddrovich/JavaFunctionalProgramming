package com.stepik.course.tasks.t7_1;

public class PlayCommand implements Command {

    private final Speaker speaker;

    public PlayCommand(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void execute() {
        speaker.play();
    }

}
