package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;  // 필드 이름과 매개변수의 이름이 다를 때, 앞에 this 생략 가능
    }
}
