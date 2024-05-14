package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        //dog 타입 매개변수
        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        //제네릭 타입
        //반환 타입을 다르게 해서 사용할 수 있음
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox); //반환 타입이 dog
        catBox.set(new Cat("냐옹이", 200));
        Cat cat = WildcardEx.printAndReturnGeneric(catBox); //반환 타입이 cat

        //와일드 카드
        //이미 정해진 반환 타입을 다르게 해서 사용할 수 없음
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);  //반환 타입이 Animal

        //강제 캐스팅을 해서 사용할 수 밖에 없는 한계기 있음.
//        Dog dog2 = (Dog) WildcardEx.printAndReturnWildcard(dogBox);  //반환 타입이 dog

    }
}
