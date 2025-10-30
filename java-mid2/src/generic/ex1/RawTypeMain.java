package generic.ex1;

public class RawTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        // GenericBox<Object> integerBox = new GenericBox<>();  // 위 한 줄과 거의 동일, 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();  // 생성 시에 타입 인자 아무것도 안 넣으면 Object로 됨.
        System.out.println("result = " + result);
    }
}
