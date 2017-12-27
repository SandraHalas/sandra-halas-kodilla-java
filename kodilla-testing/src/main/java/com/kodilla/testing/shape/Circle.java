package com.kodilla.testing.shape;

public class Circle implements Shape{
    String shapeName;
    int radius;

    public Circle(String shapeName, int radius){
        this.shapeName = shapeName;
        this.radius = radius;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return 3.14*(radius^2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (radius != circle.radius) return false;
        return shapeName.equals(circle.shapeName);
    }

    @Override
    public int hashCode() {
        int result = shapeName.hashCode();
        result = 31 * result + radius;
        return result;
    }
}
