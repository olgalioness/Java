package Homework2part1;
import java.util.Scanner;
/*
6. Азбука Морзе
На вход подается строка S, состоящая только из русских заглавных букв (без Ё).

Необходимо реализовать метод, который кодирует переданную строку с помощью азбуки Морзе и затем вывести результат на экран. Отделять коды букв нужно пробелом.

Для удобства представлен массив с кодами Морзе ниже:
{".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", ".-.", "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-", "--.--", "-.--", "-..-", "..-..", "..--", ".-.-"}


Ограничение:
0 < S.length() < 1000
 */
public class Task6 {
    public static void main(String[] args) {
        char[] alphabet = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'З', 'И', 'Й', 'Л', 'Л', 'М', 'Н', 'О', 'П',
                'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
        String[] morseCode = {".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                ".-.", "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-", "--.--", "-.--", "-..-", "..-..", "..--", ".-.-"};

            Scanner console = new Scanner(System.in);
            String input = console.nextLine();
            char[] S = input.toCharArray();

            String string = "";

            for (int i = 0; i < S.length; i++){
                for (int j = 0; j < alphabet.length; j++){
                    if (alphabet[j] == S[i]){
                        string = string + morseCode[j] + " ";
                    }
                }
            }
            System.out.print(string.trim());
        }
    }


