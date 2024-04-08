package enumeration.ref1;

public class ClassGrade {

    // 타입 안전 열거형 패턴
    public static final ClassGrade BASIC = new ClassGrade(10);    //x001
    public static final ClassGrade GOLD = new ClassGrade(20);     //x002
    public static final ClassGrade DIAMOND = new ClassGrade(30);  //x003

    private final int discountPercent;

    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
