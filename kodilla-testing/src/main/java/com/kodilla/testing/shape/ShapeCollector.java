package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figures = new ArrayList<>();

    private Shape shape;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public int addFigure(Shape shape){
        figures.add(shape);
        return figures.size();
    }

    public int removeFigure(Shape shape){
        figures.remove(shape);
        return figures.size();
    }

    public Shape getFigure(int n){
        Shape theFigure = null;
        if (n >= 0 && n < figures.size()) {
            theFigure = figures.get(n);
        }
        return theFigure;
    }

}
