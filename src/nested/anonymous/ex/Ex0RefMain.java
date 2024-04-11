package nested.anonymous.ex;

public class Ex0RefMain {
    public static void helloJava() {
        System.out.println("프로그램 시작");  //변하지 않는 부분
        System.out.println("Hello Java");   //변하는 부분
        System.out.println("프로그램 종료");
    }

    public static void helloSpring() {
        System.out.println("프로그램 시작");
        System.out.println("Hello Spring");
        System.out.println("프로그램 종료");
    }

    //변하지 않는 부분은 그대로 유지
    //변하는 부분을 외부에서 값을 입력 받아서 처리하는 방식
    public static void hello(String str) {
        System.out.println("프로그램 시작");
        System.out.println("Hello " + str);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
       hello("Java");
       hello("Spring");
    }
}
