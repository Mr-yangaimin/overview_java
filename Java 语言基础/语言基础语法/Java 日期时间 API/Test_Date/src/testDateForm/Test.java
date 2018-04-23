package testDateForm;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Test {
    public static void main(String[] args) throws ParseException {
//        使用工厂模式产生的 DateFormat 实例转换某个 Date 对象
//        Calendar calendar = Calendar.getInstance();
//        DateFormat dateFormat = DateFormat.getDateTimeInstance();
//        System.out.println(dateFormat.format(calendar.getTime()));

        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 E", Locale.ENGLISH);
        System.out.println(dateFormat.format(new Date()));

        String str = "2018年4月21日 17点17分 星期六";
        DateFormat sDateFormat = new SimpleDateFormat("yyyy年M月dd日 HH点mm分 E");
        sDateFormat.parse(str);
        System.out.println(sDateFormat.getCalendar().getTime());
    }
}
