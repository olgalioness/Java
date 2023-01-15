package Course1_IntroductionToJava;

import java.util.Scanner;                           //импортируем пакет со классом сканер

public class ConvertAmount {                        //заголок класса совпадает с именем программы
    public static void main(String[] args) {        //заголовок класса метода меин
        final double ROUBLES_PER_DOLLAR = 72.12;    //объявление константы преременной

        int dollars;
        double roubles;

        Scanner input = new Scanner(System.in);     //объект сканер для считывания входных данных

        //Получить сумму денег в американских долларах
        System.out.print("Введите сумму денег в американских долларах: ");
        dollars = input.nextInt();                //запрос и считывание входных данных

        //Конвертировать сумму денег в российские рубли
        roubles = ROUBLES_PER_DOLLAR * dollars;   //уточнение в виде предложения с присваиванием

        //Отобразить сумму денег в российских рублях в пользу покупателя
        System.out.println("Она равна " + (int) (roubles * 100) / 100.0 + " российского рубля.");
        //предложение для отображения входных данных
    }
}