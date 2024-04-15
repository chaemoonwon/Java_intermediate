package exception.ex0;

public class NetworkServiceV0 {

    //서비스 처리 로직
    //입력 받은 데이터를 서버와 함깨 client에 전달하는 로직
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();

    }
}
