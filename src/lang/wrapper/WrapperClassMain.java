package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        //Boxing
//        Integer newInteger = new Integer(10); //미래에 삭제 예정, 대신에 valueOf()를 사용
        Integer newInteger = Integer.valueOf(10);   //-128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        Integer integerObj = Integer.valueOf(10);   //-128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);


        System.out.println("newInteger = " + newInteger);
        System.out.println("IntegerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        //unBoxing
        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        //equals
        System.out.println("비교");
        System.out.println("== " + (newInteger == integerObj)); //참조값 비교 (비교 객체가 미리 생성되어 있는 경우 true를 반환)
        System.out.println("equals " + (newInteger.equals(integerObj))); //내부의 값 비교


    }
}
