package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // instanceValue++;  // 인스턴스 변수 접근, compile error
        // instanceMethod();  // 인스턴스 메서드 접근, compile error

        staticValue++;  // 정적 변수 접근
        staticMethod();  // 정적 메서드 접근
    }

    // 정적 메서드에 객체의 참조값을 매개 변수로 전달한 경우에는 해당 인스턴스 변수나 메서드 접근 가능
    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++;  // 인스턴스 변수 접근
        instanceMethod();  // 인스턴스 메서드 접근

        staticValue++;  // 정적 변수 접근
        staticMethod();  // 정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
