package final1;

// final 필드 - 생성자 초기화
public class ConstructInit {
    // 초기값이 없는 경우, 생성자를 통해 초기값을 넣는 걸 허용
    final int value;

    public ConstructInit(int value) {
        this.value = value;
    }
}
