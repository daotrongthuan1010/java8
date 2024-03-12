package TimeAPI;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalQuery;
import java.util.Date;
import java.util.Set;

public class Test {
    public static void main(String[] args) {


        Date date = new Date();
        Instant instant = Instant.now()
                .plus(Duration.ofDays(1))
                .atZone(ZoneId.of("Asia/Tokyo"))
                .toInstant();

        System.out.println("Instant: " +instant);
        LocalDateTime localDateTime = LocalDateTime.now().atOffset(ZoneOffset.ofHours(11)).toLocalDateTime();

        LocalDateTime localDateTimeTest = localDateTime.now();

        System.out.println("Local Date Time: " +localDateTime);
        LocalTime localTime = LocalTime.now();
        System.out.println("Local time: " +localTime);
        LocalDate localDate = LocalDate.now();
        System.out.println("Local date: " +localDate);

        Period period = Period.of(2,4,6);

        System.out.println(localDateTime.isBefore(localDateTime));

        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("allZoneIds = " + allZoneIds);


    }
}
