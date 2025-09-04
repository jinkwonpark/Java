package lang.clazz;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {
        // Class helloClass = Hello.class;
        Class helloClass = Class.forName("lang.clazz.Hello");

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();  // Object를 반환하기 때문에 캐스팅(형변환)을 해 준다.
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
