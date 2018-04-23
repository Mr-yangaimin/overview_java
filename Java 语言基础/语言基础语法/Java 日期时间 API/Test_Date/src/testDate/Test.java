package testDate;

import java.util.*;

public class Test {
    public static void main(String[] args){
        //January 1, 1970 00:00:00 GMT.
        //1970-1-1  8:00:01      对应到格林尼治时区：1970-1-1  0:00:01
//        Date date = new Date(70,0,1,8,0,1);
//        System.out.println(date.getTime());

//      不同时区的相同时刻所对应的时间是不同的
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        Calendar calendar1 = Calendar.getInstance
                (TimeZone.getTimeZone("GMT"), Locale.ENGLISH);
        System.out.println( calendar1.get(Calendar.YEAR) + ":" +
                            calendar1.get(Calendar.HOUR) + ":" +
                            calendar1.get(Calendar.MINUTE));

    }
}
