package time.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("기준 시각 = " + ldt);
        LocalDateTime futureDateTime = ldt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("1년 2개월 3일 4시간 후의 시각 = " + futureDateTime);


//        Period period = Period.of(1, 2, 3);
//        Duration duration = Duration.of(4, ChronoUnit.HOURS);
//        LocalDateTime plus1 = ldt.plus(period);
//        LocalDateTime plus2 = plus1.plus(duration);
//        System.out.println("plus2 = " + plus2);



    }
}
