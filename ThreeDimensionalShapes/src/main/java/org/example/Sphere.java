package org.example;

public class Sphere extends ThreeDFigure {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }


    @Override
    public Double getPerimeter() {
        System.out.println("В контексте данного метода считается объем шара!");
        return getVoleme();
    }

    @Override
    public Double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    private Double getVoleme() {
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }
}