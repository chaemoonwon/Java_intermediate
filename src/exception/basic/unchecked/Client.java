package exception.basic.unchecked;

public class Client {
    public void call() {        //throws 생략 가능, 알아서 예외를 던짐
                                //throws 선언 가능
        throw new MyUncheckedException("ex");
    }
}
