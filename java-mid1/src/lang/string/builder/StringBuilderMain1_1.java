package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");  // 인덱스 4에 삽입
        System.out.println("insert = " + sb);

        sb.delete(4, 8);  // 인덱스 4이상~8미만 삭제
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        // StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
