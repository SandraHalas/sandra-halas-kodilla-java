package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void addFigure() {
        //Given
        Shape circle = new Circle("firstCircle", 4);
        ShapeCollector shapeCollector = new ShapeCollector(circle);

        //When
        int arraySize = shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(1, arraySize);
    }

    @Test
    public void removeFigure() {
        //Given
        Shape circle = new Circle("firstCircle", 4);
        ShapeCollector shapeCollector = new ShapeCollector(circle);

        //When
        int arraySize = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertEquals(0, arraySize);
    }

    @Test
    public void getFigure() {
        //Given
        Shape circle = new Circle("firstCircle", 4);
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        shapeCollector.addFigure(circle);

        //When
        Shape retrivedCircle;
        retrivedCircle = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(circle, retrivedCircle);
    }
}
