package generic.animal;

public class Dog extends Animal {

    public Dog(String name, int size) {
        super(name, size);
    }

    // Ctrl + O: 메서드 오버라이드(Override Methods): 오버라이드 가능한 메서드 목록을 확인해 자동 생성
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
