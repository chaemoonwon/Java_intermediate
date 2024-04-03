package lang.immutable;

public class PrimitiveMain {
    public static void main(String[] args) {
        //기본형은 절대로 같은 값을 공유하지 않는다
        int a = 10;
        int b = a;  // a-> b, 값 복사 후 대입(공유 X)

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
