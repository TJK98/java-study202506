package chap2_1.exception;

import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {

        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.println("정수1: ");
                String str1 = sc.nextLine(); // 정수를 문자열로 입력
                int n1 = Integer.parseInt(str1); // 문자열을 정수로 변환

                System.out.println("정수2: ");
                String str2 = sc.nextLine(); // 정수를 문자열로 입력
                int n2 = Integer.parseInt(str2); // 문자열을 정수로 변환

                String str = null;
                str.toUpperCase();

                System.out.println("n1 / n2 = " + (n1 / n2));
                break;
            } catch (NumberFormatException e) {
//                System.out.println(e.getMessage());
//                e.printStackTrace(); // 예외 처리 안 했을 때 뜨던 빨간 메시지를 보여줌
                System.out.println("정수로만 입력하세요!");
            } catch (ArithmeticException e) {
                System.out.println("0으로는 나눌 수 없습니다.");
            }
            // 모든 예외 처리를 할 수 없으니 마지막에 Exception e를 넣어줘야 한다.항상 마지막에 있어야 한다.
            catch (Exception e) {
                System.out.println("알 수 없는 에러 발생! 조치 후 점검하겠습니다.");
            }
        }
        System.out.println("프로그램 정상 종료!");
    }
}
