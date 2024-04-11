package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근에는 접근할 수 없음.
            // 내부 클래스가 static으로 선언되었기 때문에 바깥 인스턴스 멤버와는 관계가 없음
//            System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버애는 접근할 수 있다.
            // 내부 클래스도 바깥 클래스에 있기 때문에 private도 접근 가능
//            System.out.println(NestedOuter.outClassValue);
            System.out.println(outClassValue);

        }

    }
}
