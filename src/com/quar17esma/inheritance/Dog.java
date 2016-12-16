package com.quar17esma.inheritance;

// Dog(Собака) является животным, по-этому унаследован от Animal(Животного)
// Dog(Собака) наследует все интерфейсы класса Animal(Животное),
// по-этому не нужно дублировать интерфесы в спецификации классов унаследованых от класса Animal(Животного)

public class Dog extends com.quar17esma.inheritance.Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats dog food");
    }

    @Override
    public void voice() {
        System.out.println("Cat says: Meawoo");
    }
}
