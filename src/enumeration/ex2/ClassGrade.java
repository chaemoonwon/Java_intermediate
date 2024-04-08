package enumeration.ex2;

public class ClassGrade {

    // 타입 안전 열거형 패턴
    public static final ClassGrade BASIC = new ClassGrade();    //x001
    public static final ClassGrade GOLD = new ClassGrade();     //x002
    public static final ClassGrade DIAMOND = new ClassGrade();  //x003

    //private 생성자 추가
        //클래스 내부에서만 객체를 생성할 수 있음. => 상수만 사용할 수 있게 해줌
    private ClassGrade() {
    }

}
