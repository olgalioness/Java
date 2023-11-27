package org.Basics_of_Java_Programming_1.Course.Development_Of_Simple_Java_Programs_2;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class WeeksDevelopment {
    public static void main(String[] args) {

        Date date1 = new Date();
        Date date2 = new Date();

        long daysBetween = calculateDaysBetween(date1, date2);
        System.out.println("Days between: " + daysBetween);
    }

    public static long calculateDaysBetween(Date date1, Date date2) {
        LocalDate localDate1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate localDate2 = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return java.time.temporal.ChronoUnit.DAYS.between(localDate1, localDate2);
    }
}


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
