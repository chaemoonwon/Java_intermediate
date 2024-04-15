package exception.basic.unchecked;

public class UncheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();    //예외가 발생한다는 점은 체크 예외와 같으나,
                                //컴파일러가 예외를 체크하지 않기 때문에, 언체크 예외임.
        System.out.println("정상 종료");
    }
}
