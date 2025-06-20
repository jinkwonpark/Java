package pack;

// import pack.a.User;
import pack.a.*;  // pack.a의 모든 클래스 사용 가능, 하위 패키지까지 가져오는 것이 아니라 정확히 pack.a 패키지에 있는 것만 가져온다. 하위 패키지까지 가져오는 건 없다.

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        // pack.a.User user = new pack.a.User();  // 아래와 동일
        User user = new User();  // import 사용으로 패키지 명 생략 가능
    }
}
