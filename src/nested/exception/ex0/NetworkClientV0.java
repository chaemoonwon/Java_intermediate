package nested.exception.ex0;

//요청한 서버와 데이터를 전달받은 것을 외부 서버로 전달하는 로직
//외부 서버 연결 -> 데이터 전송 -> 외부 서버 연결 해제
public class NetworkClientV0 {
    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

}
