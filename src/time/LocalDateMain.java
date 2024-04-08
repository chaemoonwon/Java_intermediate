package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();    //현재 시간
        System.out.println("오늘 날짜 = " + nowDate);
        LocalDate ofDate = LocalDate.of(2013, 11, 21);  //특정 날짜
        System.out.println("지정 날짜 = " + ofDate);

        //개선(불변)
        ofDate = ofDate.plusDays(10);   //특정 일을 더함
        System.out.println("지정 날짜 +10d = " + ofDate);

        //모든 날짜 클래스는 불변이므로, 변경이 발생하는 경우 새로운 객체를 생성해서 반환.
        // => 반환값을 받아야 함.
    }
}
