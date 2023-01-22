package Course2_DevelopmentOfSimpleJavaPrograms;

import java.util.Scanner;

public class WeeksDevelopment {
    public static void main(String[] args) {
        int number, weeks, days, remainingSeconds;

        Scanner input = new Scanner(System.in);

        // Получить общее время в секундах
        System.out.print("Введите какое сегодня число");
        number = input.nextInt();

        System.out.print("Введите день недели: ПН, ВТ, СР, ЧТ, ПТ, СБ, ВС");
        weeks = input.nextInt();

        System.out.print("Сколько дней до корпоратива?");
        days = input.nextInt();
        /*
Недели День	через 10 дней			в недели 7 дн		остаток от деления
ПН	1	+10		=11		%7			=4	ЧТ
ВТ	2	+10		=12		%7			=5	ПТ
СР	3	+10		=13		%7			=6	СБ
ЧТ	4	+10		=14		%7			=0	ВС
ПТ	5	+10		=15		%7			=1	ПН
СБ	6	+10		=16		%7			=2	ВТ
ВС	7	+10		=17		%7			=3	СР

         */

    }
}