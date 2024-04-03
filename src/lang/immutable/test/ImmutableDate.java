package lang.immutable.test;

public class ImmutableDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //Withxxx는 지정된 수정사항을 포함하는 객체의 새 인스턴스를 반환한다는 것을 관례 상으로 표현할 때 사용
    //원본 객체의 상태는 유지하면서 변경사항을 새 복사본에 포함할 때 많이 사용
    public ImmutableDate WithYear(int year) {
        return new ImmutableDate(year, month, day);
    }

    public ImmutableDate WithMonth(int newMonth) {
        return new ImmutableDate(year, newMonth, day);
    }

    public ImmutableDate WithDay(int newDay) {
        return new ImmutableDate(year, month, newDay);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
