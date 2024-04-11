package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain {

    public static void helloDice(){
        System.out.println("프로그램 시작");
        // 코드 조각 시작
        randomDice();
        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }

    public static void helloSum(){
        System.out.println("프로그램 시작");
        // 코드 조각 시작
        iterator();
        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }

    public static void hello() {
        System.out.println("프로그램 시작");

        //코드 조각
        randomDice();

        iterator();

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
        hello();
    }
}
