package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {

        //어떤 시간 단위를 변경할 지 선택해야 함
        LocalDateTime ldt = LocalDateTime.of(2018, 1, 1, 13, 30, 30);
        System.out.println("ldt = " + ldt);

        LocalDateTime plusDt1 = ldt.plus(10, ChronoUnit.YEARS);
        System.out.println("plusDt1 = " + plusDt1);

        //편의 메서드
        LocalDateTime plusDt2 = ldt.plusYears(10);
        System.out.println("plusDt2 = " + plusDt2);

        Period period = Period.ofYears(10);
        LocalDateTime plusDt3 = ldt.plus(period);
        System.out.println("plusDt3 = " + plusDt3);


    }
}
