package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
//        Integer integer = (Integer) GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + result);
        //정수 타입
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        //실수 타입
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);


        String str = GenericMethod.<String>genericMethod("hello");
        //Number로 타입을 제한하였기 때문에 사용 불가
//        GenericMethod.<String>numberMethod()

        // 제네릭 메서드 타입 추론
        System.out.println("타입 추론");
        Integer result1 = GenericMethod.genericMethod(i);
        System.out.println("result = " + result);
        //정수 타입
        Integer integerValue1 = GenericMethod.numberMethod(10);
        //실수 타입
        Double doubleValue1 = GenericMethod.numberMethod(20.0);


    }
}
