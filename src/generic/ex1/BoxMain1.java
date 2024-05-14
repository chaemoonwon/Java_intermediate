package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); //오토 박싱
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String s = stringBox.get();
        System.out.println("s = " + s);

        //정리
        /*
        * IntegerBox와 StringBox
        * 타입 안정성을 통해 코드가 중복될 지라도 안정적으로 사용 가능.
        *
        * */

    }
}
