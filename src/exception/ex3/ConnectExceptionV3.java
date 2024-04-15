package exception.ex3;

//연결 실패 시 발생하는 예외
public class ConnectExceptionV3 extends NetworkClientExceptionV3 {
    private final String address;

    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
