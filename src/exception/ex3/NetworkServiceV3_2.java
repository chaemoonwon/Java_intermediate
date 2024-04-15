package exception.ex3;


public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);     // 추가

        try {
            client.connect();
            client.send(data);
        }
        catch (ConnectExceptionV3 e) {    //연결 실패 시 처리
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {     // NetworkClientException 포함 하위 예외는 모두 처리
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } catch (Exception e) {     //모든 예외 처리
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        } finally { //연결 해제 코드
            client.disconnect();
        }

        // 여러 예외를 한번에 잡는 기능
//        catch (ConnectExceptionV3 | SendExceptionV3 e) {
//            // 공통 부모의 메서드만 사용 가능 => 둘 중 어떤 예외가 처리 될 지 알 수 없으므로
//            System.out.println("[연결 또는 전송 오류] 주소: , 메시지 " + e.getMessage());
//        }


    }
}
