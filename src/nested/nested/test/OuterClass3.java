package nested.nested.test;

public class OuterClass3 {
    public void myMethod() {
        class LocalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }

        //지역 클래스 인스턴스 생성
        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
