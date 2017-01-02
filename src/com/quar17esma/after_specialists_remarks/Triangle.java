package com.quar17esma.after_specialists_remarks;


public class Triangle extends Shape {
    private double sideA; //клас Triangle расширяется специфическими полями
    private double sideB;
    private double sideC;

    @Override
    public double getPerimeter() {
        double perimeter = sideA + sideB + sideC;

        return perimeter;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " with sides: " +
                sideA + ", " +
                sideB + ", " +
                sideC;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
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

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

}
