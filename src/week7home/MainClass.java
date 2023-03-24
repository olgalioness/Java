package week7home;

import week7.task2.TempType;
import week7.task2.Thermometer;

public class MainClass {
    public static void main(String[] args) {
        //Task 1
        //Bulb lamp = new Bulb();                         //присваиваем ссылку на объект  this на поле  к текущему экземпляру класса  к созданному экземляру классу.

        //lamp.turnOn();
        //System.out.println("Лампочка включена? :" + lamp.isShining());

        //lamp.turnOff();
        //System.out.println("Лампочка выключена? :" + lamp.isShining());

        //в методе main мы создадим экземпляр класса и будем вызывать самописные методы включть выключить и получить состяние
        //this обращаемся имеено к этой переменной
        //Task2
        Thermometer term = new Thermometer(18.0, TempType.Celsius);
        System.out.println("C : " + term.getTempCelsius() + " F : " + term.getTempFahrenheit());
        Thermometer term2 = new Thermometer(130, TempType.Fahrenheit);
        System.out.println("C : " + term2.getTempCelsius() + " F : " + term2.getTempFahrenheit());
    }
}
