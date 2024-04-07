package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";

        System.out.println(str.substring(7));
        System.out.println(str.substring(7,12));

        System.out.println(str.concat("!!!"));  // + 연산도 사용 가능
        System.out.println(str.replace("Java", "World"));       //전부 교환
        System.out.println(str.replaceFirst("Java", "World"));  //첫번째만 교환
    }
}
