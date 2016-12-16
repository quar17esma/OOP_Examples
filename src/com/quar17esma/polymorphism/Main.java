package com.quar17esma.polymorphism;


import java.util.ArrayList;

public class Main {

    // метод добавляет в список обьекты
    // поддерживающие интерфейс AnimalVoice(способность издавать звуки животных)
    // и вызывает метод voice() (подать голос) для каждого обьекта
    public static void main(String[] args) {

        ArrayList<AnimalVoice> animalVoices = new ArrayList<AnimalVoice>(); //код работает с интерфейсом

        AnimalVoice animalVoice = new Dog();
        animalVoices.add(animalVoice);

        AnimalVoice animVoice2 = new Cat();
        animalVoices.add(animVoice2);


        for (AnimalVoice av : animalVoices) {
            av.voice();     // обьекты ведут себя по-разному в зависимости от их реальных типов

                            // код работает с интерфейсом не имея информации о реально использованных
                            // классах реализующих этот интерфейс
        }
    }

}
