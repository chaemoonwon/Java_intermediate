package exception.basic.checked;


public class Service {
    Client client = new Client();

    /*
    * 예외를 잡아서 처리하는 코드
    * 예외를 처리해서 정상흐름으로 변경
    * */
    public void callCatch() {
        //try ~ catch 블럭으로 예외를 잡아서 처리해줄 수 있음.
        try {
            client.call();  //예외가 발생한 메서드를 호출
        } catch (Exception e) {
            //예외 처리 로직
            System.out.println("예외 처리, message: " + e.getMessage());
        }
        //예외를 처리하면 정상 흐름으로 바뀌어서 정상 코드가 출력이 됨.
        System.out.println("정상 흐름");
    }

    /*
    * 체크 예외를 밖으로 던지는 코드
    * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 함.
    * */
    public void catchThrow() throws MyCheckedException {
        client.call();  //터진 예외를 밖으로 던짐
    }
}
