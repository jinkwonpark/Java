package lang.string.test;

public class TestString7 {

    public static void main(String[] args) {
        String original = "    Hello Java   ";

        String trimmed = original.trim();
        // String trimmed = original.strip();  // 위 한 줄과 동일한 결과
        System.out.println("trimmed = " + trimmed);
    }
}
