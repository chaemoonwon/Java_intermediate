package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        // date1 = x001, date2 = x001
        ImmutableDate date1 = new ImmutableDate(2024,4,3);
        ImmutableDate date2 = date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
//        date1.setYear(2025);      //불변 객체이므로 setXxx를 이용해서 값을 수정할 수 없음
//        date1 = new ImmutableDate(2025, 4,3); // 객체를 만들어서 저장하는 방법
        date1 = date1.WithYear(2025);   // 메서드를 이용해 객체를 새로 만들어서 값을 반환하는 방법
                                        // x002
        System.out.println("date1 = " + date1); // x002
        System.out.println("date2 = " + date2); // x001


    }
}
