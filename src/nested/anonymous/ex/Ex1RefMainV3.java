package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        //코드 조각
        process.run();

        System.out.println("프로그램 종료");
    }

    private static void iterator() {
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
    }

    private static void randomDice() {
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("randomValue = " + randomValue);
    }

    public static void main(String[] args) {
        Process dice = new Process() {

            @Override
            public void run() {
                randomDice();
            }
        };

        Process sum = new Process() {

            @Override
            public void run() {
                iterator();
            }
        };

        hello(dice);
        hello(sum);
    }

}
