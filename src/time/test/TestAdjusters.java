package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        //입력 받은 첫날 요일과 마지막날 요일 구하기
        LocalDate dt = LocalDate.of(year, month, 1);
        
        DayOfWeek firstDayOfWeek = dt.getDayOfWeek();
        System.out.println("firstDayOfWeek = " + firstDayOfWeek);

        LocalDate lastDt = dt.with(TemporalAdjusters.lastDayOfMonth());

        DayOfWeek lastDayOfWeek = lastDt.getDayOfWeek();
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);

    }
}
