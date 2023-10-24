package week1_OOP_Exception.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*
Необходимо корректно обработать исключение и ресурсы
 */
public class FileReader {
    public static void main(String[] args) {
         try (Scanner scanner = new Scanner(new File("input.txt"))){          //файл должен находиться в конревой директории  (week1_OOP_Exception/Task1/input.txt)
             ArrayList<String> lines = new ArrayList<>();
             while (scanner.hasNextLine()){                                                 //
                 lines.add(scanner.nextLine());                                             //добавлять в arraysilst считывание из файла
             }
             for (String line: lines){                                                      //при успешном обработчике будет выводить в консоль
                 System.out.println("Line: " + line);
             }
        }catch (FileNotFoundException e) {
             System.out.println("Log:" + e.getMessage());
         }
    }
}
        //необходимо считать из файла строчки в array лист и вывести в консоль

        //необходимо обработать исключение




