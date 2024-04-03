package lang.object.toString;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model V");
        Dog dog1 = new Dog("월월1", 2);
        Dog dog2 = new Dog("월월1", 5);

        System.out.println("1. 단순 toString 호출");
        //오버라이딩 x
        //Object이 기본으로 제공하는 toString
        System.out.println(car.toString());
        //오버라이딩 O
        //Object.toString을 재정의
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        //오버라이딩 x
        System.out.println(car);
        //오버라이딩 O
        System.out.println(dog1);
        System.out.println(dog2);

        //1. 2.의 경우에는 출력 값이 같은 것을 확인할 수 있음. => toString 생략 가능

        System.out.println("3. object 다형성 활용");
        // 다형성을 활용한 객체데 대한 참조값 출력
        //오버라이딩 x
        ObjectPrinter.print(car);
        //오버라이딩 O
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);



        //참조값 x
        int i = System.identityHashCode(dog1);
        System.out.println("i = " + i);

        //참조값 확인 가능
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue);
        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("refValue2 = " + refValue2);
    }
}
