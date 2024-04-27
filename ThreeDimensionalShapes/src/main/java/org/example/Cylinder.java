package org.example;

public class Cylinder extends ThreeDFigure{

    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * (2 * Math.PI * radius + height);
    }

    @Override
    public double getArea() {
        return 2 * (Math.PI * Math.pow(radius, 2) + Math.PI * radius * height);
    }
}
