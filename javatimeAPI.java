package prc;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class javatimeAPI {
    public static void main (String [] args) {
                // Current date
                LocalDate today = LocalDate.now();
                System.out.println("Today's date: " + today);

                // Current time
                LocalTime now = LocalTime.now();
                System.out.println("Current time: " + now);

                // Current date and time
                LocalDateTime dateTimeNow = LocalDateTime.now();
                System.out.println("Current date and time: " + dateTimeNow);

                // Date and time with time zone
                ZonedDateTime zonedDateTime = ZonedDateTime.now();
                System.out.println("Current date and time with time zone: " + zonedDateTime);

                // Duration
                Duration duration = Duration.ofHours(2).plusMinutes(30);
                System.out.println("Duration: " + duration);

                // Period
                Period period = Period.ofMonths(3).plusDays(10);
                System.out.println("Period: " + period);

                // Formatting date
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String formattedDate = today.format(formatter);
                System.out.println("Formatted date: " + formattedDate);
            }
        }

