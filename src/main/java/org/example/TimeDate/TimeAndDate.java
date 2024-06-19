package org.example.TimeDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class TimeAndDate {
    public static void main(String[] args) {
        Date dt = new Date();
        System.out.println(dt);
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.MARCH);
        LocalDate ldt = LocalDate.now();
        LocalDate sec = LocalDate.of(1985, 12, 5);
        System.out.println(sec);
        LocalDateTime dd = LocalDateTime.now();
        System.out.println(dd);
//        LocalTime d = LocalTime.ofNanoOfDay(88989897787484);
    }
}
