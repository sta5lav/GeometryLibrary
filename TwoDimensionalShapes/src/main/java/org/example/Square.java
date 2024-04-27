package org.example;

public class Square extends Figure {

    private double length;
    private double width;

    @Override
    public Double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public Double getArea() {
        return length * width;
    }
}
