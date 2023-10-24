package week1_OOP_Exception.Task2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileOutput {
    private static final String PKG_DIRECTORY = "D:/Git/Gitlab/Java/Sberbank/src/week1_OOP_Exception/Task2";

    private static final String OUTPUT_FILE_NAME = "output.txt";

    private static final String INPUT_FILE_NAME = "input.txt";

    public static void main(String[] args) {
        try (Writer wr = new FileWriter(PKG_DIRECTORY + "/" + OUTPUT_FILE_NAME)){               //может возникнуть input output exception
            wr.write("HELLO!");
        } catch (IOException e){
            System.out.println("LOG: e.getMessage");
        }
    }
}
