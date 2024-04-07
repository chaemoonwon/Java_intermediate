package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱
                                    // 컴파일러가 valueOf() 기능을 대신 수행

        //Wrapper -> Primitive
        int unboxedValue = boxedValue;  // 오토 언박싱
                                        // 컴파일러가 xxxValue() 기능을 대신 수행

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
