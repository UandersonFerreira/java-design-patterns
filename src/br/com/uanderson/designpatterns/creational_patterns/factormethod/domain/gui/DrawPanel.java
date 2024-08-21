package br.com.uanderson.designpatterns.creational_patterns.factormethod.domain.gui;

import br.com.uanderson.designpatterns.creational_patterns.factormethod.domain.shape.Shape;

public class DrawPanel extends JPanel {
    private Shape shape;

    public void drawShape(Shape shape) {
        this.shape = shape;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        if (shape != null) {
            shape.draw(g);
        }
    }
}