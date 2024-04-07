package lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10; //기본형 => 메서드 x

        //value 값을 비교 대상 값으로 지정해주어야 함.
        int i1 = compareTo(value, 5);
        int i2 = compareTo(value, 10);
        int i3 = compareTo(value, 20);
        System.out.println("i1 = " + i1);   //value가 큼
        System.out.println("i2 = " + i2);   //같음
        System.out.println("i3 = " + i3);   //value가 작음
    }

    private static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
