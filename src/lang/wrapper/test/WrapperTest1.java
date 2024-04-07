package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

//        Integer value1 = Integer.valueOf(str1);
//        Integer value2 = Integer.valueOf(str2);
//
//        int int1 = value1.intValue();
//        int int2 = value2.intValue();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println("두 수의 합 = " + (num1 + num2));

    }
}
