package exception.ex2;

public class NetworkClientExceptionV2 extends Exception {

    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message); //에러 메시지
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
