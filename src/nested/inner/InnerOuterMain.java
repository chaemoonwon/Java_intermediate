package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();

        //외부 인스턴스를 알아야 내부 클래스의 객체를 생성할 수 있음.
        //바깥 클래스의 인스턴스를 생성해야 내부 클래스의 인스턴스를 생성할 수 있음.
        InnerOuter.Inner inner = outer.new Inner();

        inner.print();
        System.out.println("inner.getClass() = " + inner.getClass());

    }
}
