package final1;

// final 필드 - 필드 초기화
public class FieldInit {
    // 초기값이 있는 경우, 생성자를 통해 초기값을 넣는 걸 허용하지 않음
    static final int CONST_VALUE = 10;
    final int value = 10;

    /*
    public FieldInit(int value) {
        this.value = value;
    }
    */  // 컴파일 오류
}
