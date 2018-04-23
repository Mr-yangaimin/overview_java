package testNewDate;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test_LocalTime {
    public static void main(String[] a){
        //构建 LocalTime 实例
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(23,59);
        System.out.println(localTime1);

        LocalTime localTime2 = LocalTime.ofSecondOfDay(10);
        System.out.println(localTime2);

    }
}
