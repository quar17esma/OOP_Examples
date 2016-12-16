package com.quar17esma.inheritance;

// Cat(Кот) является животным, по-этому унаследован от Animal(Животного)
// Cat(Кот) наследует все интерфейсы класса Animal(Животное),
// по-этому не нужно дублировать интерфесы в спецификации классов унаследованых от класса Animal(Животного)

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("Cat eats cat food");
    }

    @Override
    public void voice() {
        System.out.println("Cat says: Meawoo");
    }
}
