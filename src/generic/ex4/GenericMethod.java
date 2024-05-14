package generic.ex4;

public class GenericMethod {
    public static Object objMethod(Object object) {
        System.out.println("object = " + object);
        return object;
    }

    //제네릭 메서드
    public static <T> T genericMethod(T t) {
        System.out.println("Object print = " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print = " + t);
        return t;
    }
}
