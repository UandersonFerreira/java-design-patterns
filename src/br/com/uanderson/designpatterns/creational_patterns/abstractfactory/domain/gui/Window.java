package br.com.uanderson.designpatterns.creational_patterns.abstractfactory.domain.gui;

import br.com.uanderson.designpatterns.creational_patterns.abstractfactory.domain.shape.Shape;

import javax.swing.*;

public class Window {
    private JFrame frame;
    private DrawPanel drawPanel;

    public Window(String title, int width, int height) {
        frame = new JFrame();
        frame.setSize(width, height);
        frame.setLocation(600, 400);
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPanel = new DrawPanel();
        frame.add(drawPanel);
    }

    public void show() {
        frame.setVisible(true);
    }

    public void drawShape(Shape shape) {
        drawPanel.drawShape(shape);
    }
}
