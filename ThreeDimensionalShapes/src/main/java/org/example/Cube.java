package org.example;

public class Cube extends ThreeDFigure{

    private double length;

    public Cube(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public Double getPerimeter() {
        return 12 * length;
    }

    @Override
    public Double getArea() {
        return 6 * Math.pow(length, 2);
    }
}
