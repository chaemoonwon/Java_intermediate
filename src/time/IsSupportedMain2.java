package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported);
        //지원 하면 로직 실행
        if (supported) {
            int minute = now.get(ChronoField.SECOND_OF_MINUTE); //예외 발생
            System.out.println("minute = " + minute);
        }
    }
}
