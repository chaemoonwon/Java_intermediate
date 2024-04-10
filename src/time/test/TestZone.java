package time.test;

import java.time.*;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0), ZoneId.of("Asia/Seoul"));


        System.out.println("서울의 회의 시간 = " + seoulTime);
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Asia/Seoul"));
        System.out.println("런던의 회의 시간 = " + londonTime);
        ZonedDateTime nyTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("뉴욕의 회의 시간 = " + nyTime);

//        LocalDateTime ldt = LocalDateTime.of(2024, 1, 1, 9, 0, 0);

//        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
//        System.out.println("서울의 회의 시간 = " + zdt);
//        ZonedDateTime zdt2 = zdt.withZoneSameInstant(ZoneId.of("Europe/London"));
//        System.out.println("런던의 회의 시간 = " + zdt2);

//        ZonedDateTime zdt3 = zdt.withZoneSameInstant(ZoneId.of("America/New_York"));
//        System.out.println("뉴욕의 회의 시간 = " + zdt3);
    }
}
