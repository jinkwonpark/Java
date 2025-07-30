package lang.object;

// 부모가 없으면 묵시적으로 Object 클래스를 상속받는다.
// public class Parent extends Object {  // 아래 코드와 동일, extends Object 추가
public class Parent {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
