package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    /*
    MemberConstruct(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 50;
    }
    */
    // 위와 동일
    MemberConstruct(String name, int age) {
        // System.out.println("go");
        this(name, age, 50);  // this()는 생성자 코드의 첫 줄에만 작성할 수 있다. 윗줄 주석 해제 시, 컴파일 오류 발생
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
