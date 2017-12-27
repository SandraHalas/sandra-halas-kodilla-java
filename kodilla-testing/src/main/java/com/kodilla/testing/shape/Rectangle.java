package com.kodilla.testing.shape;

public class Rectangle implements Shape{
    String shapeName;
    int height;
    int sideLength;

    public Rectangle(String shapeName, int height, int sideLength){
        this.shapeName = shapeName;
        this.height = height;
        this.sideLength = sideLength;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return (height*sideLength)/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (height != rectangle.height) return false;
        if (sideLength != rectangle.sideLength) return false;
        return shapeName.equals(rectangle.shapeName);
    }

    @Override
    public int hashCode() {
        int result = shapeName.hashCode();
        result = 31 * result + height;
        result = 31 * result + sideLength;
        return result;
    }
}
