package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        /*
        final Data data;  // 참조형
        data = new Data();
        */  // 아래의 한 줄과 동일
        final Data data = new Data();
        // data = new Data();  // final이고 이미 할당을 했기 때문에 새로운 참조값을 담을 수 없다. final 변경 불가 컴파일 오류

        // 참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
