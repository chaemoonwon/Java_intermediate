package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        //나누기
        String[] fruit = fruits.split(",");

        for (String s : fruit) {
            System.out.println(s);
        }

        //합치기
        //문자열 배열 연결 (delimiter, 배열)
        String joinString = String.join("->",fruit);
        System.out.println("joinString = " + joinString);
    }
}
