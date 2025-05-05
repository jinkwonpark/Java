package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};  // 배열 생성 간략 버전, 배열 선언과 함께 사용시 new int[] 생략 가능. 이와 같이 선언할 때는 생성과 동시에 초기화까지 한 줄에 해야 함, 아래와 같이는 안 됨.
        /*
        int[] students;
        students = {90, 80, 70, 60, 50};
        */

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "점수: " + students[i]);
        }
    }
}