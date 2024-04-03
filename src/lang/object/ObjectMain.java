package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString()은 Object 클래스 메서드( java.lang.Object )
        //toString() 객체에 대한 정보를 제공 => lang.object.Child@4e50df2e
        String string = child.toString();
        System.out.println("string = " + string);

    }
}
