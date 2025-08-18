package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);
        // return new ImmutableObj(value + addValue);  // 위 두 줄과 동일, Inline Variable: Ctrl+Alt+N, 변수나 메서드를 없애고 그 자리에 값이나 식을 바로 넣음
    }

    public int getValue() {
        return value;
    }
}
