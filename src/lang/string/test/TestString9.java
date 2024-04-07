package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] emails = email.split("@");
        String id = emails[0];
        String domain = emails[1];

        System.out.println("id = " + id);
        System.out.println("domain = " + domain);
    }
}
