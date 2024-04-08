package enumeration.ex2;

import static enumeration.ex2.ClassGrade.*;

public class DiscountService {

    //매개변수로 ClassGrade를 사용함으로써 열거된 타입의 생성된 객체만 사용할 수 있게 함.
    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

            if (classGrade == BASIC) {
                discountPercent =10;
            } else if (classGrade == GOLD) {
                discountPercent = 20;
            } else if (classGrade == DIAMOND) {
                discountPercent = 30;
            } else {
                System.out.println("할인 x");
        }

        // 10000 * (20/100) = 2000
        return price * discountPercent / 100;
    }
}
