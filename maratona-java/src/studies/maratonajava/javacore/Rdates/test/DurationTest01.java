package studies.maratonajava.javacore.Rdates.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeNowMinusSevenHours = LocalTime.now().minusHours(7);

        Duration duration1 = Duration.between(now, nowAfterTwoYears);
        Duration duration2 = Duration.between(timeNow, timeNowMinusSevenHours);
        Duration duration3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));

        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
    }
}
