package org.example;

public class Triangle extends Figure{

    private double a;
    private double b;
    private double c;


    @Override
    public Double getPerimeter() {
        return a + b + c;
    }

    @Override
    public Double getArea() {
        return (a * b) / 2;
    }
}
