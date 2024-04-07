package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";       //x001
        String str2 = str.concat("java");   //x002
        System.out.println("str = " + str);     //String은 불변 객체이므로 반환 값을 지정해 주어야 함.
        System.out.println("str2 = " + str2);
    }
}
