package com.quar17esma.after_specialists_remarks;


import java.util.ArrayList;
import java.util.List;


//базовый абстрактный клас Shape расширяется дочерними класами Circle, Triangle, Square и Rectangle;

// дочерние класы расширяют базовый клас спцифическими полями и
// каждый дочерний клас имеет свою реализацию метода getPerimeter(), который считает периметр фигуры и
// и свою реализацию метода toString()


public class Main {

    // метод создает екземпляры дочерних класов Shape,
    // добавляет их в список,
    // считает для каждого периметр и
    // выводит результат в консоль
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>(); //ArrayList также имеет специфическую реализацию интерфейса List


        Shape circle = new Circle(5);
        shapes.add(circle);

        Shape triangle = new Triangle(3,4,5);
        shapes.add(triangle);

        Shape square = new Square(4);
        shapes.add(square);

        Shape rectangle = new Rectangle(3,6);
        shapes.add(rectangle);


        for (Shape shape:shapes) {
            // обьекты ведут себя по-разному в зависимости от их реальных типов
            // каждый обьект вызывает свой метод getPerimeter()(метод считает периметр фигуры)
            double perimeter = shape.getPerimeter();

            //выводим результат работы метода
            System.out.println(shape.toString() + ", perimeter = " + Double.toString(perimeter));
        }

    }
}
