package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();


        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        // 오타 및 소문자 입력
//        int diamondD = discountService.discount("DIAMONDD", price);
//        System.out.println("DIAMOND 등급의 할인 금액: " + diamondD);
//
//        int diamond = discountService.discount("diamond", price);
//        System.out.println("diamond 등급의 할인 금액: " + diamond);

        // 위와 같은 문제로 인해 String 타입을 이용할 경우 설정 String 값이 아닌 잘못된 값 입력할 시 컴파일 시 오류 감지할 수 없음
        // => 런타임 시 오류 발생하므로 디버깅이 어려워 질 수 있음.




        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);

    }

}
