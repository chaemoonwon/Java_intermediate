package enumeration.ex3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        //java.lang.ENUM 클래스를 자동으로 상속 받음

        // 기능

        //모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));  // Arrays.toString(values)은 배열의 참조값이 아닌 배열의 내부 값을 출력

        for (Grade value : values) {
            System.out.println("value = " + value.name() + ", ordinal =" + value.ordinal());
        }

        //String -> ENUM 변환, 잘못된 문자 => IllegalArgumentException 예외 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);

        System.out.println("gold = " + gold);   //toString() 오버라이딩 기능

    }
}
