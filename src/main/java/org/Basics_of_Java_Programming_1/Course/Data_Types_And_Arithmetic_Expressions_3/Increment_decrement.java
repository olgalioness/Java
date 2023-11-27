package org.Basics_of_Java_Programming_1.Course.Data_Types_And_Arithmetic_Expressions_3;

public class Increment_decrement {
    public static void main(String[] args) {

        double b = 1;
        b += 4 + 5.5 * 1.5;       //x + (4 + 5.5 * 1.5); Составной оператор присваивания выполняется самым последним
        System.out.println(b + " //double b = 1 ; b += 4 + 5.5 * 1.5; ");

        double a = 6.5;
        a += a + 1;                 //6.5+6.5 + = 14
        System.out.println(a + " //double a = 6.5;  a += a + 1;");

        int j, i, k;
        i = 1;
        j = ++i;
        System.out.println("i равно " + i + ", j равно " + j + " // i = 1; j = ++i;");

        i = 1;
        k = i++;
        System.out.println("i равно " + i + ", k равно " + k + " // i = 1; k = i++");

        double x = 1.0;
        double y = 5.0;
        double z = x-- + (++y);          //x=0     +(++y)
        System.out.println(z + "    double x = 1.0;  double y = 5.0; double z = x-- + (++y);");
        System.out.println(x);          //присвоение нового значения
        System.out.println(y);          //присвоение нового значения

        int v = 6;
        int w = v++;
        System.out.println(w + " int v = 6; int w = v++;" );


        int p = 1;
        int o = p + p++;                    //еквивателетно o = p + p;    p = p+1;
        System.out.println("o равно " + o);
        System.out.println("p равно " + p);

        p=1;
        int l = p + p--;                //еквивателетно l = p + p;    p = p-1;
        System.out.println("l равно " + l);
        System.out.println("p равно " + p);
}
}

// += отсутвсвуют пробелы