package chap1_6.encap;

public class Main {
    public static void main(String[] args) {


        Car myCar = new Car();
        // 시동을 걸기 위해서 먼저 엔진 오일을 분사
        // 실린더 작동 -> 시동 버튼 누르고 -> 시동 걸기
        myCar.pressButton();

        // 기어 변속
        myCar.mode = "D";
        System.out.println("현재 모드:" + myCar.mode);
    }
}
