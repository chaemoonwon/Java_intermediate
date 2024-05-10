package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {

        //Object를 통한 다형성 활용
        ObjectBox integerBox = new ObjectBox();

        //Object -> Integer
        integerBox.set(10);
        Object object1 = integerBox.get();
        Integer integer = (Integer) object1;
        System.out.println("integer = " + integer);

        Integer integer2 = (Integer) integerBox.get();
        System.out.println("integer2 = " + integer2);

        //Object -> String
        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str = " + str);

        //Object 사용시 문제점
        //1. 잘못된 타입의 인수 전달 => 타입 안정성 문제 발생
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get();    //Integer를 String으로 캐스팅 할 수 없음.
        System.out.println("result = " + result);

        //정리

        /*
        * ObjectBox
        * 코드 중복을 줄일 수 있지만, 타입 안정성에 문제가 발생함.
        *
        * */

        // => 이와 같은 문제를 해결하기 위해 제네릭을 사용함.
    }

}
