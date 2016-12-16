package com.quar17esma.encapsulation;

// Клиенту доступен лишь публичный метод drive(),
// детали реализации скрыты в приватных методах

// Клаент взаимодействует с обьектом Driver(Водитель),
// по-примеру реального мира, через метод drive()-команду поехали,
// а Driver уже сам знает, что ему делать

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.drive();
    }
}
