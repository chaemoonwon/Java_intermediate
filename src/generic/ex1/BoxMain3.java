package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T의 타입 결정

        integerBox.set(10);
//        integerBox.set("문자10"); // Integer 타입만 허용, 컴파일 오류

        Integer integer = integerBox.get(); //Integer 타입 변환(캐스팅 x)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();

        stringBox.set("hello");
//        stringBox.set(10);
        String str = stringBox.get();
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        //객체를 생성하는 시점에 원하는 타입을 정의해서 사용할 수 있음.
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        //타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}
