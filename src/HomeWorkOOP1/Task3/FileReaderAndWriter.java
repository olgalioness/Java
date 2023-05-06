package HomeWorkOOP1.Task3;
/*
        Реализовать метод, открывающий файл ./input.txt и сохраняющий в файл ./output.txt текст из input,
        где каждый латинский строчный символ заменен на соответствующий заглавный. Обязательно использование try с ресурсами.
        */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;                                               //динамический импорт, если обращаемся к классу

//import static java.util.locale.ENGLISH;                               //статический импорт на вход

public class FileReaderAndWriter {
    private static final String PKG_DIRECTORY = "src/HomeWorkOOP1/Task3/";                  //путь на директорию с рута-root
    private static final String OUTPUT_FILE_NAME = "output.txt";                            //константа, указывающая на файл
    private static final String INPUT_FILE_NAME = "input.txt";                              //константа, указывающая на файл input

    public static void main(String[] args) throws IOException {                            //метод запускающий приложение
        readAndWrite();
    }
    public static void readAndWrite() throws IOException {                                                  //статический метод для чтения и записи в результирующий файл
            Scanner scanner = new Scanner(new File(PKG_DIRECTORY + "/" + INPUT_FILE_NAME));       //конкатенация пути файла до файла
                                                                                                            //может выбрасывать исключения (не найден файл) инпут аутпут эксепшен чек
            Writer writer = new FileWriter(PKG_DIRECTORY + "/" + OUTPUT_FILE_NAME);                // записывает все в файл, обсолютный путь куда нужно положить файл
            //Locale locale = ENGLISH;
        try (scanner; writer){                                                                              //отработал авто клоуз интерфейс, try с ресурсами
            while (scanner.hasNext()){
                writer.write(scanner.nextLine().toUpperCase() + "\n");                                  //если у сканера что-то еще на вход и органиовывать считывание и запись на вход. локаль - выбор языка
                //writer.write(scanner.nextLine().toUpperCase(Locale.US) + "\n");                           //ограниченная локаль
                //writer.write(scanner.nextLine().toUpperCase(Locale.getDefault()) + "\n");
            }
        }
    }
}
