package enumeration.ref2;

public enum Grade {
    BASIC(10),GOLD(20),DIAMOND(30);     //열거형 상수의 선언

    private final int discountPercent;

    //private 생략
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

}
