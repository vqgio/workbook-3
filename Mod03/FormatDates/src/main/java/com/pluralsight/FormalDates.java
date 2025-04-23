package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormalDates {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatMMDDYYYY = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter formatYYYYMMDD = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatMonthDayYear = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter formatDayMonthDayYearTime = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm ");

        System.out.println(dateTime.format(formatMMDDYYYY));
        System.out.println(dateTime.format(formatYYYYMMDD));
        System.out.println(dateTime.format(formatMonthDayYear));
        System.out.println(dateTime.format(formatDayMonthDayYearTime));


    }



}
