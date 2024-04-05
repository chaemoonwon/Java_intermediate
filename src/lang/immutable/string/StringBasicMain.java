package lang.immutable.string;

public class StringBasicMain {

    public static void main(String[] args) {
        //대문자로 시작하는 타입은 클래스 타입.
        //String 클래스를 통해 문자열을 생성하는 방법
        String str1 = "hello";      //1. 쌍타옴표 => new String("hello")으로 변경해서 참조값을 대입해줌.
        String str2 = new String("hello");  // 2. 객체 생성

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

    }


}
