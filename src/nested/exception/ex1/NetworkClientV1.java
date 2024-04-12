package nested.exception.ex1;

//요청한 서버와 데이터를 전달받은 것을 외부 서버로 전달하는 로직
//외부 서버 연결 -> 데이터 전송 -> 외부 서버 연결 해제
public class NetworkClientV1 {
    private final String address;
    public boolean connectError;
    public boolean sendError;


    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        //연결 실패
        if (connectError) {
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }

        // 추가 사항
        // => 연결에 실패하였을 경우에 데이터를 전송하면 안 됨.
        // => 발생한 오류에 대한 상세한 설명 추가해야될 필요성(오류 로그)


        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        //전송 실패
        if (sendError) {
            System.out.println(address + " 서버에 데이터 전송 실패: " + data);
            return "sendError";
        }

        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }


    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }

    }
}
