package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);   //x002 반환 => 리턴 값을 받지 않으므로 사용 불가
                        //불변 객체와 관련된 메서드들은 보통 객체를 새로 만들어서 반환하기 때문에 반환값을 받아야 함

        //계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println("obj1 = " + obj1.getValue());
//        System.out.println("obj2 = " + obj2.getValue());

    }
}
