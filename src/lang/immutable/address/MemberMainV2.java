package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        //회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원 B의 주소를 부산으로 변경해야 함.
//        Address address1 = memberB.getAddress();
//        address1.setValue("부산");
//        memberB.getAddress().setValue("부산");    //불변이므로 컴파일 오류
        memberB.setAddress(new ImmutableAddress("부산"));     //memberB의 주소는 바꿀 수 있음,단 ImmutableAddress클래스의 주소 값은 변경 불가
                                                                    //그러므로 값을 변경하기 위해서는 새로 ImuutableAddress 객체를 생성해서 값을 지정해주어야 함.
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

    }
}
