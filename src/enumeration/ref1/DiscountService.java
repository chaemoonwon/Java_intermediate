package enumeration.ref1;

public class DiscountService {

    //매개변수로 ClassGrade를 사용함으로써 열거된 타입의 생성된 객체만 사용할 수 있게 함.
    public int discount(ClassGrade classGrade, int price) {
        // 10000 * (20/100) = 2000
        return price * classGrade.getDiscountPercent() / 100;
    }
}
