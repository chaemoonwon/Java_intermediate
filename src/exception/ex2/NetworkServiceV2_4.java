package exception.ex2;

public class NetworkServiceV2_4 {

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
        }

        // catch로 잡을 수 없는 예외가 발생했을 때 해당 코드가 호출되지 않는 문제 발생
        client.disconnect();
    }
}
