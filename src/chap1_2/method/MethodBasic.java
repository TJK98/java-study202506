package chap1_2.method;

public class MethodBasic {

    // 자바는 함수라는 개념이 없음
    // 메서드: 객체가 가진 기능
    // main : 실행 전용 함수
    // 메서드는 정의할 수 있는 위치는 클래스 내부, 메서드 외부
    // 파라미터의 타입을 정의 해줘야 한다.
    // return 되는 값의 타입을 void 자리에 써줘야 한다.

//    public static void main(String[] args)
    public static void main(String... args) {
        int result1 = add(20, 30);
        System.out.println("result1 = " + result1);

        int result2 = addAll(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println("result2 = " + result2);

        int result3 = addAll(10, 20, 30, 40, 50, 60, 70);
        System.out.println("result3 = " + result3);
    }

    // 2개의 정수를 받아서 더해서 반환
    static int add(int n1, int n2) {
        return n1 + n2;
    }

    // byte + byte여도 타입 캐스팅으로 인하여 앞에 int를 써야 한다
    int add2(byte n1, byte n2) {
        return n1 + n2;
    }

    int[][] foo() {
        return new int[3][4];
    }

    // return이 없으면 void를 써야한다.
    void bar() {
        System.out.println("hello!!");
    }

    // n개의 정수를 전달 받아서 다 더해서 리턴
//    static int addAll(int[] numbers) {
//        int total = 0;
//        for (int n : numbers) {
//            total += n;
//        }
//        return total;
//    }

    // ...은 배열로 보내면 배열로 받아주고 그냥 숫자로 보내도 배열로 받아준다.
    static int addAll(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // ... 은 배열 하나 받을 때만 사용, 두개 이상 ...을 쓰게 되면 어디서부터 어디까지가 다른 배열로 나뉠지 모름
    // 배열 2개를 전달 받을 때
    static void ticky(int[] nums1, int[] nums2) {
        ticky(new int[]{1, 2, 3}, new int[]{4, 5, 6});
    }

    // 여러개를 리턴하고 싶을 때는 배열로 리턴하면 된다.
    int[] multiReturn(int n1, int n2) {
        return new int[] {n1 + n2, n1 - n2};
    }
}