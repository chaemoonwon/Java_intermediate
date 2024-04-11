package nested.anonymous;


import nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        //지역 변수
        int localVar = 1;

        //익명 클래스
        //선언과 생성을 동시에
        Printer printer = new Printer() {
            //이름이 없는 구현체
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };
        
        printer.print();
        System.out.println("printer.getClass() = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
