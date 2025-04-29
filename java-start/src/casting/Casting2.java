package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue;  // 컴파일 오류 발생
        intValue = (int) doubleValue;  // 형변환
        System.out.println(intValue);  // 출력: 1
        System.out.println("doubleValue = " + doubleValue);  // 형변환을 해도 doubleValue의 값은 유지, 변수의 값은 대입연산자(=)를 사용해서 직접 대입할 때만 변경

        // 명시적 형변환 예시
        System.out.println((int) 10.5);
    }
}