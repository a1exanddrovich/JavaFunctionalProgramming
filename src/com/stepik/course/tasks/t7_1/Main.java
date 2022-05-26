package com.stepik.course.tasks.t7_1;

public class Main {

    public static void main(String[] args) {
        App app = new App();
        Speaker speaker = new SpeakerImp();

        app.add(speaker::play);
        app.add(speaker::pause);
        app.add(new VolumeDownCommand(speaker));
        app.add(new VolumeUpCommand(speaker));

        app.run();
    }

}
