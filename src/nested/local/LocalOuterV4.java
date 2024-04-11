package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        //지역 변수
        //지역 변수는 스택 프레임이 종료되는 순간 함께 제거됨.
        int localVar = 1;   // 값이 변하면 안 됨. => 사실상 final

        //지역 클래스
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();
        //만약 localVar의 값을 변경한다면? 다시 캡쳐? 동기화 문제 발생
//        localVar = 10;
//        paramVar = 10;
        return printer;

    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        //printer.print()를 나중에 실행. process()의 스택 프레임이 사라진 후에 실행
        printer.print();


        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field f : fields) {
            System.out.println("f = " + f);
        }

        /*
        * 캡처 변수의 값을 변경하지 못하는 이유
지역 변수의 값을 변경하면 인스턴스에 캡처한 변수의 값도 변경해야 한다.
반대로 인스턴스에 있는 캡처 변수의 값을 변경하면 해당 지역 변수의 값도 다시 변경해야 한다.
개발자 입장에서 보면 예상하지 못한 곳에서 값이 변경될 수 있다. 이는 디버깅을 어렵게 한다.
지역 변수의 값과 인스턴스에 있는 캡처 변수의 값을 서로 동기화 해야 하는데, 멀티쓰레드 상황에서 이런 동기화
는 매우 어렵고, 성능에 나쁜 영향을 줄 수 있다. 이 부분은 멀티쓰레드를 학습하면 이해할 수 있다.
        * */
    }
}
