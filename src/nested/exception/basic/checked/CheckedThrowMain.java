package nested.exception.basic.checked;

public class CheckedThrowMain {
    //throws는 어떤 예외를 던질 지 필수로 지정해 주어야 함.
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();       //예외를 처리하지 않았음.= > main밖으로 예외를 터뜨림 => 프로그램 종료.
                                    //어디서 예외가 터졌는지 stack trace를 통해서 확인 가능.
        System.out.println("정상 흐름");
    }
}
