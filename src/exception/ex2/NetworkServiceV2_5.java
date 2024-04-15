package exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);     // 추가


        //예외처리 후
        //문제
        //사용 후에는 disconnect()를 호출해서 연결 해제
        try {
            //정상 흐름
            client.connect();
            client.send(data);      //RuntimeExcepton 예외 발생했을 경우 => catch로 잡지 않는 예외 => 예외가 밖으로 던져짐
        } catch (NetworkClientExceptionV2 e) {
            //예외 흐름
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {
            //try ~ catch ~ finally 구조는 정상 흐름, 예외 흐름, 마무리 흐름을 제공한다.
            //여기서 try 를 시작하기만 하면, finally 코드 블럭은 어떤 경우라도 반드시 호출된다.
            //심지어 try , catch 안에서 잡을 수 없는 예외가 발생해도 finally 는 반드시 호출된다.
            //finally 로직 호출 후에 예외가 밖으로 던져짐.
            client.disconnect();
        }
    }
}
