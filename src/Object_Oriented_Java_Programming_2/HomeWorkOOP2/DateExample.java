package HomeWorkOOP2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) throws ParseException {

        String str = "02.30.2023";
        String str2 = "2023.02.30";
        //SimpleDateFormat dateFormat = new DateFormatter("dd.MM.yyyy");                                    //улетает
        // Date date = dateFormat.parse(str);

        DateFormat df1 = new SimpleDateFormat("MM.dd.yyyy");
        DateFormat df2 = new SimpleDateFormat("MM.dd.yyyy");
        Date strDate = df2.parse(str);
        System.out.println(strDate);

        LocalDate date = LocalDate.parse(str2, DateTimeFormatter.ofPattern("uuuu.MM.dd").withResolverStyle(ResolverStyle.SMART));                  //локал дейт настраивается с ResolverStyle (патер задается иначе) испльзовать с резолверами. организованы с енамчиками. смарт с тремя флагами
        System.out.println(date);

        LocalDate date2 = LocalDate.parse(str2, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        System.out.println(date2);

        LocalDate date3 = LocalDate.parse(str2, DateTimeFormatter.ofPattern("uuuu.MM.dd").withResolverStyle(ResolverStyle.STRICT));                  //обработка dateFormatTime exception , resolver на стороне вызывающего кода обработать эксепшен
        System.out.println(date3);

        LocalDate date4 = LocalDate.parse(str2, DateTimeFormatter.ofPattern("uuuu.MM.dd").withResolverStyle(ResolverStyle.LENIENT));                 //в большую сторону плюсует
        System.out.println(date4);
    }
}
//более гибкий LocalDate
//DateFormat если не верно передаем дату на конец месяца 30.02.2023.  накидывает 2 дня и получаем второе марта. не жесткие огнраничения.