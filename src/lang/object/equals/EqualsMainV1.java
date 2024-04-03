package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 userV1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id-100");

        //Object 클래스에 정의되어 있는 equals 메서드는 == 동일성 비교를 함
        /*
        * public boolean equals(Object obj)
        * { return (this == obj);}
        *
        * */
        System.out.println("equality = " + userV1.equals(userV2));
        System.out.println("identity = " + (userV2 == userV1));

        //동등서 비교를 하기 위해서는 재정의 해서 사용해야 함.

    }
}
