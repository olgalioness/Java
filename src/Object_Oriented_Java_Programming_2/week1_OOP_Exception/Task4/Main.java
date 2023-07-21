package week1_OOP_Exception.Task4;

public class Main {


    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.input();
        calc.calculate();
        System.out.println(calc.calculate());
    }
}


// Try with resourse  -без блока finnaly
//если программа не консольная и есть вероятность утечки памяти (серверное приложение , где открываются ресурс) необходимо проверять что закрывается ресурс - блок finally
