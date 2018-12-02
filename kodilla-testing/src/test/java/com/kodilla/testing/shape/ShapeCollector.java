package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<>();

    public boolean addFigure(Shape shape) {
        shapes.add(shape);
        return false;
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure(int f) {
        return shapes.get(f);
    }

    public ArrayList<Shape> getShapes(Circle circle) {
        return shapes;
    }
}
