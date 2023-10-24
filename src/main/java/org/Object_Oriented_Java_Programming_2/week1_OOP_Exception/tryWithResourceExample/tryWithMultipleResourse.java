package week1_OOP_Exception.tryWithResourceExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class tryWithMultipleResourse {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("test.txt"));                       //трай вис ресурсерс
            PrintWriter writer = new PrintWriter(new File("testWrite.txt"));            //трай вис мультиплер ресурсерс
        ){
            while (scanner.hasNext()) {
                writer.println(scanner.nextLine());
            }
        } catch (FileNotFoundException ex){                                                             //отлавливаем в блоке кода
            System.out.println("TryWithMultipleResource catch block!");
            throw new RuntimeException();


        }
    }

}
//трай необязательно каждый раз надо отдельный писать трай. это различные ресурсы счение или поток вывода в файл. врайтер куда-то.
//trywithresource позволяют работат с мультиплеер ресурсами
//можно использововать