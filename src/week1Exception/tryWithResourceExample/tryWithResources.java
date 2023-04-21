package week1Exception.tryWithResourceExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tryWithResources {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("test.txt"))) {                             //пиштся в круглых скобочках. есть другое написание
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException ex){                                                             //отлавливаем в блоке кода
            System.out.println("TryWithResource catch block!");
            ex.printStackTrace();


        }
    }

}
//tryWithResource
//try не всегда применяется для обработки исключений, иногда для того чтобы не закрывать. можно использовать без блока кетч
//ушел блок кода finally
//появился авто клозбд интерфейс - автоматическое происходит закрывание
//scanner implements (инкрементит) Closeable интерфейс,   Closeable extends AutoCloseable
//метод public void clode() throws IOException   закрывает стримы потоки счения, двиси конекшены
//try автоматически вызовет метод и не надо будет писать блок finally