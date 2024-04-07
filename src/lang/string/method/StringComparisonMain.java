package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!"; //앞 글자 대문자
        String str2 = "hello, java!"; //모두 소문자
        String str3 = "Hello, World";

        System.out.println(str1 == str2);
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));
        System.out.println("c".compareTo("a"));

        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareToIgnoreCase(str2));

        System.out.println(str1.startsWith("Hello"));
        System.out.println(str1.endsWith("Java!"));
    }
}
