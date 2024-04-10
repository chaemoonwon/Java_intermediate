package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();

        //시작
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);

        //끝(다음달 직전까지)
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

//        System.out.println("offsetWeekDays = " + offsetWeekDays);
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i <offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate daytIterator = firstDayOfMonth;
        while (daytIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", daytIterator.getDayOfMonth());
            if (daytIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            daytIterator = daytIterator.plusDays(1);
        }
    }
}
