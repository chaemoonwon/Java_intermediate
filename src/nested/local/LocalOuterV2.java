package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        //지역 변수
        int localVar = 1;

        //지역 클래스
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }


            /*
            * 지역 클래스의 접근 범위
    * 자신의 인스턴스 변수인 value 에 접근할 수 있다.
    * 자신이 속한 코드 블럭의 지역 변수인 localVar 에 접근할 수 있다.
    * 자신이 속한 코드 블럭의 매개변수인 paramVar 에 접근할 수 있다.
      참고로 매개변수도 지역 변수의 한 종류이다.
    * 바깥 클래스의 인스턴스 멤버인 outInstanceVar 에 접근할 수 있다.
      (지역 클래스도 내부 클래스의 한 종류이다.)
            * */
        }

        Printer printer = new LocalPrinter();
        printer.print();

    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
}
