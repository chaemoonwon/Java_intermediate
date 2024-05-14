package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();

        // 문제
        /*
        * generic에서 타입 매개변수를 사용하면 어떤 타입이든지 사용가능 하다는 문제 발생
        * 따라서 타입 매개변수는 어떤 타입이든 수용할 수 있는 Object로 가정하고, Object의 기능만 사용할 수 있음.
        * */
    }
}
