package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 100);

        // 타입 매개변수 추론으로 인한 명시적 타입 생략 가능
        AnimalMethod.<Dog> checkup(dog);
        AnimalMethod.<Cat> checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
//        Dog bigger = AnimalMethod.bigger(dog, cat);           //dog ,cat 타입 모두 있으므로, 타입 매개변수 추론 불가 => 컴파일 오류
//        Dog bigger = AnimalMethod.<Dog>bigger(dog, cat);      //타입 매개변수가 dog 타입으로 추론 가능하지만, cat 타입이 있으므로 컴파일 오류
        Dog bigger = AnimalMethod.<Dog>bigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
