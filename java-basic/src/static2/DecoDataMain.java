package static2;

// import static static2.DecoData.staticCall;
// import static static2.DecoData.*;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();  // static import 기능을 사용하면 앞에 클래스명(DecoData.) 생략 가능, import static은 정적 메서드 뿐만 아니라 정적 변수에도 사용 가능

        System.out.println("2. 인스턴스 호출 1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출 2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 정적 메서드에 참조값이 있는 경우에는 해당 인스턴스 메서드 접근 가능
        System.out.print("정적 메서드에 참조값이 있는 경우: ");
        DecoData.staticCall(data1);

        // 추가
        // 인스턴스를 통한 접근 - 코드를 볼 때, 정적 메서드가 인스턴스 메서드인 것처럼 오해할 수 있기 때문에 비추천
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}
