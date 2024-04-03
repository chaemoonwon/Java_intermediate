package lang.object.poly;

public class ObjectPolyEample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object o = new Object();        //Object 인스턴스도 가능

//        Object[] objects = new Object[3];
        Object[] objects = {dog, car, o};

        size(objects);

    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);

    }
}
