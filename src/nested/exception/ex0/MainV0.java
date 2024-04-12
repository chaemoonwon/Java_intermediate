package nested.exception.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args) {

        NetworkServiceV0 networkServiceV0 = new NetworkServiceV0();

        //사용자로부터 입력 받은 data를 서비스로 전달하는 코드
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkServiceV0.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
