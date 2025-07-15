/*
package chap1_3;

// 자동차 설계도
public class Vehicle {

    */
/*
        클래스의 구성 요소
        클래스 내부에 작성해야 한다.
        1. 속성 (필드)
            - 일반 속성: 일반적으로 변하지 않는 속성
            - 상태 속성: 수시로 변하는 속성
            - 복합 속성 (부품 속성): 객체는 객체를 필드로 쓸 수 있다.
        2. 생성자 (객체가 생성될 때 호출되는 함수, 객체의 초기화 담당)
        3. 메서드 (기능)
     *//*


    // 속성 (필드)
    String company; // 일반 속성
    String model; // 일반 속성
    int currentSpeed; // 상태 속성
    int fuel; // 상태 속성
    boolean isOn; // 상태 속성
    Owner owner; // 복합 속성, 자동차 주인

    // 기본 생성자 - 파라미터가 없는 생성자, JVM이 컴파일시에 자동으로 생성해준다. 단, 다른 생성자가 하나라도 존재하면 생성되지 않는다.
    Vehicle() {} // 자동 생성 되는 기본 생성자

    // String 2개를 받아서 초기화하는 생성자
    Vehicle(String c, String m) {
        company = c;
        model = m;
    }

    // 기능 (메서드)
    void info() {
        System.out.println("자동차 주인: " + owner.name);
        System.out.println("자동차 모델명: " + model);
        System.out.println("자동차 등록일: " + owner.registerDate);
    }

    void powerOn() {
        if (isOn) {
            System.out.println("시동이 이미 걸려있습니다.");
            return;
        }
        isOn = true;
        System.out.println(model + "의 시동이 걸렸습니다.");
    }

    void powerOff() {
        if (!isOn) {
            System.out.println("시동이 걸려있지 않습니다.");
            return;
        }
        isOn = false;
        System.out.println("시동이 꺼졌습니다.");
    }

    void accelerate() {
        System.out.printf("%s 자동차가 주행을 시작합니다.\n", model);
        currentSpeed += 20;
        System.out.printf("현재 속도: %dkm/h\n", currentSpeed);
    }
}*/
