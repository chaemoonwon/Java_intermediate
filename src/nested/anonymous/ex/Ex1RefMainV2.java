package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV2 {

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
        class Dice implements Process {

            @Override
            public void run() {
                randomDice();
            }
        }

        class Sum implements Process {

            @Override
            public void run() {
                iterator();
            }
        }

        hello(new Dice());
        hello(new Sum());
    }

}
