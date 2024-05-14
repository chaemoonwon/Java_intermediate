package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {
    //제네릭 메서드
    //타입 매개변수 T => Box<Dog>, Box<Cat>, Box<Object>
    //T를 활용해서 사용하기 때문에 T의 타입이 변화함.
    //T는 제네릭 메서드를 만들거나, 제네릭 타입을 만들어서 사용할 수 있을 때 사용함.
    // => 제네릭 타입 x, 제네릭 메서드 x =>타입 매개변수를 활용해서 만듬
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // Animal 매개 변수 타입
    // 반환 X
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    // 반환 O
    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }


    //일반적인 메서드
    //와일드 카드
    //이미 만들어진 제네릭 타입을 사용할 때 편리하게 이용
    //이미 만들어진 제너릭 타입이 있을 경우 ?를 통해 어떠한 타입이든 들어올 수 있츰.
    // => 제네릭 타입 o, 제네릭 메서드 x => 일반적인 메서드에 단순히 매개변수로 ?(와일드 카드)를 사용해 제네릭 타입을 받을 수 있음.

    //비제한 와일드 카드
    //와일드카드 ?는 모든 타입을 받을 수 있다 => Box<Dog>, Box<Cat>, Box<Object>
    //?만 사용
    static void printWildcardV1(Box<?> box) {
//        Object object = box.get();    ?에 모든 타입이 들어올 수 있으므로 Object로 반환됨.
        System.out.println("? = " + box.get());
    }


    //상한 와일드 카드
    //받을 수 있는 타입 매개변수를 Animal 타입으로 제한함. => Animal의 자식 타입도 사용 가능
    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
