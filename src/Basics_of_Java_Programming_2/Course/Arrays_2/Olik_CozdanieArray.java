package Course7_Arrays;

public class Olik_CozdanieArray {
    public static void main(String[] args) {
        int month_days[];                           //создание массива типа int
                                                    //значение массива = null
        int month_day[] = new int[5];                //оператор new зарезервировать выделить память под массив, размер - количество элементов в массиве
                                                    // нули - для числовых типов, false - для логических, null - для ссылочных типов

        //создадим массив количества дней в каждом месяце
        month_days = new int[12];                   //индексация элементов массива начинается с 0
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("В апреле " + month_days[3] + " дней.");

        int month_days2[] = { 21, 28, 31, 30, 31, 31, 30, 31, 30, 31 };
        System.out.println("В апреле " + month_days2[3] + " дней.");

        //вычислим среднее значение массива значений
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;

        for(int i = 0; i < 5; i++)
            result = result + nums[i];
        System.out.println("Среднее значение равно " + result / 5);

        for(int j = 0; j < nums.length; j++){                       //в цикле переменной nums[0] присваивается значение 0.0 и т.д.
            nums[j] = j;
            System.out.println(nums[j]);
        }
    }
}
