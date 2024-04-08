package enumeration.ex2;

import static enumeration.ex2.ClassGrade.*;

public class ClassRefMain {
    public static void main(String[] args) {
        //클래스에 대한 정보
        System.out.println("class BASIC = " + BASIC.getClass());
        System.out.println("class GOLD = " + GOLD.getClass());
        System.out.println("class DIAMOND = " + DIAMOND.getClass());

        //각각의 상수는 모두 서로 각각 다른 ClassGrade 인스턴스를 참조하기 때문에 참조값이 다르게 출력된다
        System.out.println("ref BASIC = " + BASIC);
        System.out.println("ref GOLD = " + GOLD);
        System.out.println("ref DIAMOND = " + DIAMOND);
    }
}
