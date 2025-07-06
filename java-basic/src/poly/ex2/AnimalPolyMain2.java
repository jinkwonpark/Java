package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();  // Animal dog = new Dog(); 로 가능
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();
        // Animal[] animalArr = new Animal[]{dog, cat, cow, duck};  // 아래 코드와 동일
        Animal[] animalArr = {dog, cat, cow, duck};

        // 동물이 추가되어도 변하지 않는 코드
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
