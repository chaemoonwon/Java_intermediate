package exception.ex1;

public class NetworkServiceV1_1 {

    //서비스 처리 로직
    //입력 받은 데이터를 서버와 함깨 client에 전달하는 로직
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);     // 추가

        client.connect();
        client.send(data);
        client.disconnect();

    }
}
