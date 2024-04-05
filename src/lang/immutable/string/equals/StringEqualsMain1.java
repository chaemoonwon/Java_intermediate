package lang.immutable.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");  //x001
        String str2 = new String("hello");  //x002
        System.out.println("str1 == str2 = " + (str2 == str1)); //참조값이 다르므로 false가 출력됨.
        System.out.println("str1.equals(str2) = " + str1.equals(str2)); // String 클래스에서 equals()는 value값을 비교하도록 Override되어 있음.

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("str3 == str4 = " + (str3 == str4));     // 문자열 리터럴, 문자열 풀
                                                                    // 리터럴을 사용할 경우 문자열 풀을 생성함
        System.out.println("str3.equals(str4) = " + str3.equals(str4));
    }
}
