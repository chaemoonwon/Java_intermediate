package enumeration.ref3;

public enum Grade {
    BASIC(10),GOLD(20),DIAMOND(30);;     //열거형 상수의 선언

    private final int discountPercent;

    //private 생략
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    //기능 추가
    //등급별 할인율 계산 로직
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
