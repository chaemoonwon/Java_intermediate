package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        StringBuilder stringBuilder = new StringBuilder();
        //toString()은 String 타입으로 변경하는 메서드 => 불변 객체로 변경
        String result = stringBuilder.append(str).reverse().toString();
        System.out.println("result = " + result);

    }
}
