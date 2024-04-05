package lang.immutable.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {

        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, java!";

        // valueOf 메서드
        String numString = String.valueOf(num);
        System.out.println(numString);

        String boolString = String.valueOf(bool);
        System.out.println(boolString);

        String objString = String.valueOf(obj);
        System.out.println(objString);

        // 문자 + x -> 문자
        String numString2 = "" + num;
        System.out.println("numString2 = " + numString2);

        // toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("strCharArray = " + strCharArray);       // 참조값으로 나옴
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
