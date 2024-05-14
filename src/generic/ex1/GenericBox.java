package generic.ex1;

public class GenericBox<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    // T를 타입 매개변수라고 함.
    // T는 이후에 각각의 타입으로 변환해서 사용 가능.
}
