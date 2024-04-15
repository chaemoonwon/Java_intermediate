package exception.ex1;

//서비스 처리 로직
//입력 받은 데이터를 서버와 함깨 client에 전달하는 로직
public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);


        String connectResult = client.connect();
        //오류 로그 남기기
        //결과가 성공이 아니다 => 오류
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult); //오류 코드 남기기
            return; //연결 실패 후 프로그램 중지 = > 연결 해제와 관련된 로직은 호출되지 않음.
        }

        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return;
        }

        // => 오류가 발생해도 사용 후에 반드시 disconnect를 호출해서 새로 연결을 할 수 있도록 해야함.
        client.disconnect();
    }

    private boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
