package lang.object.toString;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object ob = new Object();
        String string = ob.toString();

        //toString() 반환값 출력
        /*
        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());}
        */
        System.out.println("string = " + string);

        //object 직접 출력
        //ob = java.lang.Object@b4c966a
        /*
        * System.out.println() 내부에서 toString() 반환값 출력
        * */
        System.out.println("ob = " + ob);


        //=> Object에 대한 정보를 출력하기 위해 toString() 메서드를 사용할 필요가 없음
        //객체에 대한 참조값을 얻을 수 있는 이유는 System.out.println() 내부에서 toString() 반환값 출력하기 때문임.
    }
}
