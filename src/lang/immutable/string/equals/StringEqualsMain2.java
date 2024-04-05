package lang.immutable.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        //equals로 문자열 비교를 하는 이유
        // == 비교를 할 경우 newString을 명시해준 결과와 리터럴("")을 이용해서 비교해준 결과가 서로 다른 결과가 나오기 때문에
        // => 메서드를 통해 어떤 값이 매개변수로써 지정될 수 실행전에 확인하기 어려우기 때문에
        String str1 = new String("hello");  //x001
        String str2 = new String("hello");  //x002
        System.out.println("메서드 호출 비교 1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교 2: " + isSame(str3, str4));

    }

    private static boolean isSame(String x, String y) {
        return x == y;
    }
}
