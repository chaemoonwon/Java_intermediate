package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer    다른 타입으로 전환은 오토 박싱 언박싱 불가
                                // 같은 타입을 변환 할 시 이용 가능
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        // Integer -> int (오토 언박싱)
        int intValue = integer1;
        System.out.println("intvalue = " + intValue);

        // int -> Integer (오토 박싱)
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);
    }
}
