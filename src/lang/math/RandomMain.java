package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
//        Random random = new Random();
        Random random = new Random(1);  //seed가 같으면 random의 처음 실행 결과를 출력할 경우 같은 결과값이 반복해서 출력된다.

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        //범위 조회
        int randomRange1 = random.nextInt(10);
        System.out.println("0~9 = " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1;
        System.out.println("1~10 = " + randomRange2);
    }
}
