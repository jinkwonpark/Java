package nested.anonymous.ex;

import java.util.Random;

// 지역 클래스 사용
public class Ex1RefMainV2 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");  // 변하지 않는 부분

        // 코드 조각 시작
        process.run();
        // 코드 조각 종료

        System.out.println("프로그램 종료");  // 변하지 않는 부분
    }

    public static void main(String[] args) {

        class Dice implements Process {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        }

        class Sum implements Process {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        Process dice = new Dice();  // 부모는 자식을 담을 수 있기 때문에 Process로 해도 된다.
        Process sum = new Sum();

        System.out.println("Hello 실행");
        hello(dice);
        hello(sum);
    }
}
