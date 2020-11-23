package by.tms.examples.oop.inheritance;

import java.awt.*;

public class CellulosePaper implements Paper {
    private String text = "ньювейв";
    private Color color = Color.WHITE;

    @Override
    public String read() {
        return text + " на фоне " + color;
    }

    @Override
    public void write(String text) {
        this.text = text;
    }

    @Override
    public void burn() {
        color = color.darker();
        System.out.println("Я горю и темнею");
    }

}
