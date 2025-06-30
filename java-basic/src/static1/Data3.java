package static1;

public class Data3 {
    public String name;
    public static int count;  // static

    public Data3(String name) {
        this.name = name;
        count++;  // 원래 Data3.count++;이라 해야 하지만 같은 클래스 안이기 때문에 생략 가능
    }
}
