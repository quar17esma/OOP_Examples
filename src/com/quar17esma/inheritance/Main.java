package com.quar17esma.inheritance;

// Классы Cat(Кот) и Dog(Собака) являются животными, по-этому унаследованы от Animal(Животного)
// Классы Cat(Кот) и Dog(Собака) наследует все интерфейсы класса Animal(Животное),
// по-этому не нужно дублировать интерфесы в спецификации классов унаследованых от класса Animal(Животного)

public class Main {

    //потомки класс Animal используют унаследованные интерфесы
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.eat();
        cat.voice();

        Dog dog = new Dog();
        dog.eat();
        dog.voice();
    }
}
