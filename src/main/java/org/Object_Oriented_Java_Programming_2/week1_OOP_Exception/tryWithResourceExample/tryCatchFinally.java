package week1_OOP_Exception.tryWithResourceExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tryCatchFinally {
    public static void main(String[] args) {
        Scanner scanner = null;                         //объявление чтобы было доступно в блоке finnaly
        try {
            scanner = new Scanner(new File("text.txt"));
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e){                                  //Exception обобщенная ошибка
            System.err.println("Catch block!");
            e.printStackTrace();

        } finally {
            System.out.println("finally block!");
            if (scanner != null) {
                scanner.close();                                            //при закрытии может бросать ошибки, обработка этих ошибок
            }
        }
    }
}

//java 6, объявить сканер, чтобы был доступен в блоке finally
