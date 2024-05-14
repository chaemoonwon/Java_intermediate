package generic.ex5;

public class EraserBox<T> {
//    public boolean instanceCheck(Object param) {
////        return param instanceof T;    //오류
//        //런타임 시에 Object가 되는 문제로 인해 오류 발생
//    }

    public void create() {
//        return new T(); //오류
        // new T는 항상 Object가 되는 문제 발생
    }
}
