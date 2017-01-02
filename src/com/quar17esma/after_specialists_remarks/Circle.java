package com.quar17esma.after_specialists_remarks;


public class Circle extends Shape {
    private double radius; //клас Circle расширяется специфическим полем


    @Override
    public double getPerimeter() {
        double perimeter = 2*radius*Math.PI;

        return perimeter;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " with radius = " + radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
