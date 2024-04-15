package exception.basic.checked;

public class Client {
    //throws 해당 예외를 던지는 코드
    public void call() throws MyCheckedException {

        //문제 상황
        throw new MyCheckedException("ex"); //throw는 예외를 발생시키는 코드
    }
}
