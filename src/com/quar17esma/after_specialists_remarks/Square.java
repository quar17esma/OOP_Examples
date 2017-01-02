package com.quar17esma.after_specialists_remarks;


public class Square extends Shape {
    private double sideA; //клас Square расширяется специфическим полем

    @Override
    public double getPerimeter() {
        double perimeter = 4*sideA;

        return perimeter;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " with side: " +
                sideA;
    }

    public Square(double sideA) {
        this.sideA = sideA;
    }


    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
}
