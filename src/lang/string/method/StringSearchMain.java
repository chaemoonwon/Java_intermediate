package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world.";
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));        // 앞에서 부터
        System.out.println(str.indexOf("Java", 10));
        System.out.println(str.lastIndexOf("Java"));    // 뒤에서 부터

    }
}
