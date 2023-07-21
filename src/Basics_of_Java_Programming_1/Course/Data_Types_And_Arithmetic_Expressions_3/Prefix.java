package Course3_DataTypesAndArithmeticExpressions;

public class Prefix {
    public static void main(String[] args) {
        int i = 10;                                                         //1. int newNum = 10 * i;
        int newNum = 10 * i++;                                              //2. i = i + 1;
        System.out.println("i равно " + i + ", newNum равно " + newNum);    //эквивалетное выражение

        int b = 10;                                                         //1. i = i + 1;
        int Num = 10 * (++b);                                               //2. int newNum = 10 * i;
        System.out.println("b равно " + b + ", newNum равно " + Num);       //эквивалетное выражение

        int c = 1;                      //Сначала вычисляется ++i и i становится равным 2. При вычислении i * 3, i уже равен 2.
        int k = ++c + c * 3;            //Таким образом, k становится равным 8.
        System.out.println(k);

        int a = 6;
        int d = a++;
        System.out.println(a);              //7
        System.out.println(d);              //6
        a = 6;
        d = ++a;
        System.out.println(a);              //7
        System.out.println(d);              //7

    }
}
