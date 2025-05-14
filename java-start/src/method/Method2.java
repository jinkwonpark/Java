package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return;  // 모든 메서드는 항상 return을 호출해야 함. 그러나 반환 타입이 void인 경우 자바 컴파일러가 return을 자동으로 넣어줘서 생략 가능.
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
}