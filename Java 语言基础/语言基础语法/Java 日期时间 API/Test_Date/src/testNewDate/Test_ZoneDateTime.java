package testNewDate;

import java.time.*;

public class Test_ZoneDateTime {
    public static void main(String[] a){
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDateTime,zoneId);
        System.out.println(zonedDateTime1);

        Instant instant = Instant.now();
        ZoneId zoneId1 = ZoneId.of("GMT");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.ofInstant(instant,zoneId1);
        System.out.println(zonedDateTime2);
    }
}
