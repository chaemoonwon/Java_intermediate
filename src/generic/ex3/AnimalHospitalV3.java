package generic.ex3;

import generic.animal.Animal;

// 타입 매개변수 제한 => <T extends Animal>
// 타입 매개변수인 T에 접근할 수 있는 타입은 Animal과 상속된 자식들만 타입에 접근할 수 있음.
public class AnimalHospitalV3<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }



}
