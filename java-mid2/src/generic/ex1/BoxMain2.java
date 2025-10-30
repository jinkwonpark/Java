package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        /*
        Object object = integerBox.get();  // object에서 Ctrl + Alt + Shift + T: 리팩터링 메뉴 열기(Refactor this) -> Inline Variable  or  Ctrl + Alt + N: 인라인 변수
        Integer integer = (Integer) object;
        */  // 아래 한 줄과 동일
        Integer integer = (Integer) integerBox.get();  // Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();  // Object -> String 캐스팅
        System.out.println("str = " + str);

        // 잘못된 타입의 인수 전달 시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get();  // String -> Integer 캐스팅 예외
        System.out.println("result = " + result);
    }
}
