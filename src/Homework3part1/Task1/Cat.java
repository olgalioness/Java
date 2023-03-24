package Homework3part1.Task1;

import java.util.Random;

/*
1.	Необходимо реализовать класс Cat.
У класса должны быть реализованы следующие приватные методы:
●	sleep() — выводит на экран “Sleep”
●	meow() — выводит на экран “Meow”
●	eat() — выводит на экран “Eat”
И публичный метод:
status() — вызывает один из приватных методов случайным образом.
 */
public class Cat {
    private void sleep(){
        System.out.println("Sleep");
    }
    private void meow(){
        System.out.println("Meow");
    }
    private void eat(){
        System.out.println("Eat");
    }

    public void status() {
        Random random = new Random();
        int number = random.nextInt(1, 4);
        switch (number) {
            case 1:
                sleep();
                break;
            case 2:
                meow();
                break;
            case 3:
                eat();
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.status();
    }
}
