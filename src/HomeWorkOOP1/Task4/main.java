package HomeWorkOOP1.Task4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четное число:");
        MyEvenNumber myEvenNumber = new MyEvenNumber(scanner.nextInt());

        System.out.println(myEvenNumber.getN());
    }
}

