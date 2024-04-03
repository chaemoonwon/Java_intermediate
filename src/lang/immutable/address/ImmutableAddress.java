package lang.immutable.address;

public class ImmutableAddress {

    // 필드를 final로 지정하지 않더라도
    // set메서드를 없애면 값을 변경할 수 있는 방법이 없지만, final을 지정함으로써
    // 불변 값이라는 것을 명시적으로 알 수 있게 해줌.

    private final String value; //값을 변경하지 못하게 막음.

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }

}
