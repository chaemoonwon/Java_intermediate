package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    //equals() 구현

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    //동등성 비교를 위한 equals 메서드 재정의
//    @Override
//    public boolean equals(Object obj) {
//        UserV2 user = (UserV2) obj;
//        return id.equals(user.id);
//    }

    //정확한 equals 메서드 구현 => IDE에서 자동 생성 가능
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
