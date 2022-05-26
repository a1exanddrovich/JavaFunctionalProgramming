package com.stepik.course.tasks.t7_1.ide;

import java.awt.*;

public class EditorImpl implements Editor {

    private String value;

    @Override
    public void selectAll() {
        this.value = System.in.toString();
    }

    @Override
    public String getSelection() {
        return va;
    }

    @Override
    public void replaceSelection(String value) {

    }

    @Override
    public String getClipboard() {
        return null;
    }

    @Override
    public void saveToClipboard(String value) {

    }
}
