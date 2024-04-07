package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        //indexOf, subString 조합
        //indexOf를 이용해 해당 문자가 시작하는 인덱스를 출력하고
        //substring을 이용해 해당 인덱스부터 혹은 인덱스까지의 문자열을 출력한다.
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext);
        String filename = str.substring(0, extIndex);
        String extName = str.substring(extIndex);

        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);

    }
}
