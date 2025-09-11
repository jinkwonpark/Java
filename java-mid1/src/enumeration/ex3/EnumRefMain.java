package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + refValue(Grade.BASIC));  // x001
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));  // x002
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));  // x003
    }

    // ENUM(열거형)은 toString을 오버라이딩 해놔서 자기 이름(상수 이름)이 나온다. 참조값을 보기 위해 아래와 같이 메서드를 만들었다.
    // System.identityHashCode(): 자바가 관리하는 객체의 참조값을 숫자로 반환
    // Integer.toHexString(): 숫자를 16진수로 변환, 우리가 일반적으로 확인하는 참조값은 16진수
    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
