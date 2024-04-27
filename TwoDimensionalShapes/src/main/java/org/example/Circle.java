package org.example;

public class Circle extends Figure{

    private double radius;

    @Override
    public Double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
