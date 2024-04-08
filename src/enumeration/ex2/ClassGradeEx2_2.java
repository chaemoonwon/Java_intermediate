package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        //새로 객체를 만들어서 인수로 입력한 경우, 문제가 생김
        DiscountService discountService = new DiscountService();
//        ClassGrade classGrade = new ClassGrade();       // 새로 만든 인스턴스
        // private 생성자 추가로 인한 컴파일 오류
//        int result = discountService.discount(classGrade, price);
//        System.out.println("newClassGrade 등급의 할인 금액 = " + result);


    }
}
