package exception.ex2;

public class NetworkServiceV2_3 {

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
            client.send(data);
            client.disconnect();        //예외 발생 시 무시
        } catch (NetworkClientExceptionV2 e) {
            //예외 흐름
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
            return; //connect 실패로 인해 send()코드 출력 x => sendMessage()를 빠져 나감
        }

    }
}
