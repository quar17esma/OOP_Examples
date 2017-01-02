package com.quar17esma.after_specialists_remarks;


public class Rectangle extends Shape {
    private double sideA; //клас Rectangle расширяется специфическими полями
    private double sideB;


    @Override
    public double getPerimeter() {
        double perimeter = 2 * (sideA + sideB);

        return perimeter;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " with sides: " +
                sideA + ", " +
                sideB;
    }


    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
