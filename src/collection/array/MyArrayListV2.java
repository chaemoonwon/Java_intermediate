package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

    private static final int DEFAULT_CAPACITY = 5;  //배열의 크기

    private Object[] elementData;       //다양한 데이터 타입
    private int size = 0;       //리스트의 크기

    //기본 생성자 초기 고정된 값 지정
    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    //생성할 때 초기값 지정
    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        //코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    //코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        
        //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사

    }

    //인덱스의 항목 조회
    public Object get(int index) {
        return elementData[index];
    }

    //인덱스의 항목을 변경
    //기존 값을 반환
    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    //검색 기능
    //인덱스 번호 반환
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        //[1,2,3,null,null] size =3
        //[1,2,3] // size크기만큼만 출력
//        return Arrays.toString(elementData);
        return Arrays.toString(Arrays.copyOf(elementData, size))
                + " size=" + size + ", capacity=" +elementData.length;
    }
}
