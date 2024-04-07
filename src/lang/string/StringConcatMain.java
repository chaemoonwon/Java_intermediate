package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello"; //x001
        String b = " java"; //x002

        String result1 = a.concat(b);
        String result2 = a + b;     //참조형은 + 연산이 되지 않는데 String 타입은 자주 사용되므로 + 연산이 되는 것을 확인할 수 있다.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

    }
}
