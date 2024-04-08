package enumeration.ref3;
import static enumeration.ref3.Grade.*;

public class ClassGradeRefMain3_4 {
    public static void main(String[] args) {
        int price = 10000;

        //등급을 추가했을 경우 코드 변경 x
        //Grade.values()를 사용할 경우 Grade 열거형의 모든 상수를 배열로 구할 수 있음.
        Grade[] grades = Grade.values();

        for (Grade grade : grades) {
            printDiscount(grade, price);
        }
    }

    //중복 제거
    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액 = " + grade.discount(price));
    }
}
