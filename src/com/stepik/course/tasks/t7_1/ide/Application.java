package com.stepik.course.tasks.t7_1.ide;

public class Application {

    private final Executor executor;
    private final Editor editor;

    public Application(Executor executor, Editor editor) {
        this.executor = executor;
        this.editor = editor;
    }

    void run() {
        executor.executeCommand(editor::selectAll);
        executor.executeCommand(() -> editor.saveToClipboard("dsf"));
        executor.executeCommand(editor::getClipboard);
    }

}
