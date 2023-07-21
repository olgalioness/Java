package week1_OOP_Exception.Task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/*
Считать построчно из input и каждую строку записывать в output.txt без промежуточного буфера.
 */
public class FileReadWrite {
    private static final String PKG_DIRECTORY = "D:/Git/Gitlab/Java/Sberbank/src/week1_OOP_Exception/Task3";

    private static final String OUTPUT_FILE_NAME = "output.txt";

    private static final String INPUT_FILE_NAME = "input.txt";


    public static void main(String[] args) {
        try {
            readAndWriter();                            //отдельный метод читать и писать
        } catch (IOException e) {
            System.out.println("LOG: " + e.getMessage());
        }
    }
    public static void readAndWriter() throws IOException{
        Scanner scanner = new Scanner (new File(PKG_DIRECTORY + "/" + INPUT_FILE_NAME));
        Writer writer = new FileWriter (PKG_DIRECTORY + "/" + OUTPUT_FILE_NAME);

        try (scanner; writer){
            while (scanner.hasNext()){
                writer.write(scanner.nextLine() + "\n");
            }
        }
    }
}


//читаем из одной дирректории
