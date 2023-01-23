package Course5_Math;

public class MinMaxAbsRandom {
    public static void main(String[] args) {
        //Методы min(), max() и abs()
        //Методы min() и max() возвращают минимальное и максимальное значение из двух чисел (типа int, long, float или double).
        //Метод abs() возвращает модуль числа (типа int, long, float или double).
        //Метод random() генерирует случайное значение типа double, большее или равное 0.0 и меньшее 1.0 (0 <= Math.random() < 1.0).
        //a + Math.random() * b возвращает случайное число между a и a + b, не включая a + b.

        System.out.println("1. " + Math.max(2, 3));                                     //3
        System.out.println("2. " + Math.min(2.5, 4.6));                                 //2.5
        System.out.println("3. " + Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6)));    //4.6
        System.out.println("4. " + Math.abs(-2));                                       //2
        System.out.println("5. " + Math.abs(-2.1));                                     //2.1

        System.out.println("6. " + (int)(Math.random() * 10) );                         //случайное целое число между 0 и 9
        System.out.println("7. " + 50 + (int)(Math.random() * 50));                     //случайное целое число между 50 и 99

    }
}
