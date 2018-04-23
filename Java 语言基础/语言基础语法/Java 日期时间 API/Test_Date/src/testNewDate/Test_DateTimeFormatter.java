package testNewDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test_DateTimeFormatter {
    public static void main(String[] a){
        //格式化日期时间对象
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(formatter.format(localDateTime));

        String str = "2008年08月23日 23:59:59";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime localDateTime2 = LocalDateTime.parse(str,formatter2);
        System.out.println(localDateTime2);

    }
}
