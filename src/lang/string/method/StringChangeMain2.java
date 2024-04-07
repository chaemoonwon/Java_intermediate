package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpace = "          Java Programming ";

        System.out.println(strWithSpace.toLowerCase());
        System.out.println(strWithSpace.toUpperCase());

        System.out.println(strWithSpace.trim() + "'");
        System.out.println(strWithSpace.strip() + "'");
        System.out.println(strWithSpace.stripLeading() + "'");
        System.out.println(strWithSpace.stripTrailing() + "'");
    }
}
