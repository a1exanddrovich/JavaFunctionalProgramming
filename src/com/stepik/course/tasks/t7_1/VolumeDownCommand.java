package com.stepik.course.tasks.t7_1;

public class VolumeDownCommand implements Command {

    private final Speaker speaker;

    public VolumeDownCommand(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void execute() {
        speaker.volumeDown();
    }

}
