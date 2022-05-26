package com.stepik.course.tasks.t7_1;

public class VolumeUpCommand implements Command {

    private final Speaker speaker;

    public VolumeUpCommand(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void execute() {
        speaker.volumeUp();
    }

}
