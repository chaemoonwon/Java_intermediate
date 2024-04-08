package enumeration.ref3;

public class DiscountService {
    public int discount(Grade grade, int price) {
        // 10000 * (20/100) = 2000
        return grade.discount(price);
    }
}
