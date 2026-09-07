import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
//        Instant instant = Instant.now();

        //DATE AND TIME NOW
//        LocalDateTime dateTime = LocalDateTime.now();
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

//        String newDateTime = dateTime.format(formatter);
//        System.out.println(newDateTime);

        LocalDate date = LocalDate.of(2026, 9, 7);
        LocalDateTime dateTime1 = LocalDateTime.of(2026, 12, 25, 12, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2027, 1, 1, 0, 0, 0);

        if (dateTime1.isBefore(dateTime2)){
            System.out.println(dateTime1 + " is earlier than " + dateTime2);
        } else if (dateTime1.isAfter(dateTime2)){
            System.out.println(dateTime1 + " is later than " + dateTime2);
        } else if(dateTime1.isEqual(dateTime2)){
            System.out.println(dateTime1 + " is equal to " + dateTime2);
        }
    }
}
