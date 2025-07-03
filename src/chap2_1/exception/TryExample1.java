package chap2_1.exception;

public class TryExample1 {

    public static void main(String[] args) {

        // 예외처리 : 에러를 복구해주는 개념 x, 보험처럼 대비하는 것.
        // 에러가 날 것 같은 곳에다가 예외처리를 적용

        try {
            // 예외 가능성이 있는 코드를 적고
            // 예외가 발생하면 기존 실행 흐름을 끊고 바로 catch로 이동합니다.
            int n1 = 10, n2 = 0;
            System.out.println("나눗셈 시작!");

            int result = n1 / n2;
            // 에러가 나는 순간 catch로 간다.
            System.out.printf("%d / %d = %d\n", n1, n2, result);
        }
        // 에러가 나지 않으면 catch는 실행되지 않는다.
        catch (Exception e) {
            // 에러가 나면 어떻게 할 건지를 적습니다.
            System.out.println("0으로 나눌 수 없습니다!");
        }

        System.out.println("프로그램 정상 종료!");
    }
}
