package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
//        animal.getName();
    }

    //제너릭 타입과 메서드가 서로 다른 타입 매개변수 명으로 지정했을 경우
    public <Z> Z printAndReturn(Z z) {
        System.out.println("animal.className: " + z.getClass().getName());
        System.out.println("t.className: " + z.getClass().getName());
        return z;
    }

    // 제네릭 타입과 메서드를 같은 타입 매개변수 명으로 지정했을 경우
    // 제네릭 타입보다 메서드의 우선순위가 더 높음.
    // 서로 관련이 없음 => 제네릭 클래스 소속과 메서드 소속은 서로 다르므로 다른 객체가 호출됨.
    // T의 매개변수는 상한이 없으므로, Object로 취급됨.
//    public <T> T printAndReturn(T t) {
//        System.out.println("animal.className: " + animal.getClass().getName());
//        System.out.println("t.className: " + t.getClass().getName());
//        return t;
//    }
    // 프로그래밍에서는 같은 타입 매개변수 명은 다른 객체를 호출하더라도 모호하기 때문에, 변수명을 다르게 해서 사용하는 것을 권장함.
}
