package org.example;

public class Square extends Figure {

    private double length;
    private double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public Double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public Double getArea() {
        return length * width;
    }
}
