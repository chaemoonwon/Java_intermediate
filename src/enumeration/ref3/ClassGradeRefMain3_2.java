package enumeration.ref3;
import static enumeration.ref3.Grade.*;

public class ClassGradeRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        //DiscountService 제거
        System.out.println("basic 등급의 할인 금액 = " + BASIC.discount(price));
        System.out.println("gold 등급의 할인 금액= " + GOLD.discount(price));
//        System.out.println("diamond 등급의 할인 금액= " + DIAMOND.discount(price));
    }
}
