package nested.exception.ex1;

//서비스 처리 로직
//입력 받은 데이터를 서버와 함깨 client에 전달하는 로직
public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        //정상 흐름 + 예외 흐름이 섞여 있는 로직 (반환 값을 받아서 예외 처리)
        //정상 흐름과 예외 흐름을 분리하기 위해 예외 처리 매커니즘이 존재
        String connectResult = client.connect();
        //연결에 실패했을 경우에는 오류 로그를 남기고 데이터 관련 호출은 하지 않지만, 연결은 해제애야 함.
        //연결에 성공하였지만 데이터 전송에 실패하였을 경우에 오류 로그를 남기고 연결 해제
        // => 연결에 성공하든 실패하든 네트워크 연결은 해제해야함.
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult); //오류 코드 남기기
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }

        // => 오류가 발생해도 사용 후에 반드시 disconnect를 호출해서 새로 연결을 할 수 있도록 해야함.
        client.disconnect();
    }

    private boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}
