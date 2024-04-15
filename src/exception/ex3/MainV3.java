package exception.ex3;


import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) {
//        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
        NetworkServiceV3_2 networkService = new NetworkServiceV3_2();

        //사용자로부터 입력 받은 data를 서비스로 전달하는 코드
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
