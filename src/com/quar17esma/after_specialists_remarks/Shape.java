package com.quar17esma.after_specialists_remarks;

// базовый клас
public abstract class Shape {
    public abstract double getPerimeter();

    //определяет toString()
    @Override
    public String toString() {
        return getClass() + " perimeter = " + Double.toString(getPerimeter());
    }
}
