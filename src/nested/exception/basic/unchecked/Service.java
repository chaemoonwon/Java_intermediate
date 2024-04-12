package nested.exception.basic.unchecked;

/*
* UnChecked 예외는
* 예외를 잡거나, 던지지 않아도 됨.
* 예외를 잡지 않으면 자동으로 밖으로 던짐
* */
public class Service {

    Client client = new Client();

    /*
     * 필요한 경우 예외를 잡아서 처리 가능
     * */
    public void callCatch() {

        try {
            client.call();
        } catch (MyUncheckedException e) {
            //예외 처리 로직
            System.out.println("예외 처리, message: " + e.getMessage());

        }
        System.out.println("정상 로직");
    }

    /*
    * 예외를 잡지 않고 던지는 코드
    * 체크 예외와 다르게 throws 예외 선언을 하지 않아도 됨.
    * */
    public void callThrow() {
        client.call();      //예외 코드
    }
}
