/*
package chap1_3;

import java.util.Arrays;

// class: 객체를 찍어내는 틀 (설계도)
// 설계도 클래스에는 main 메서드를 만들지 않는다.
public class Dancer {

    // 클래스에 객체의 속성과 기능 정의
    // 속성(필드): 객체를 명사적으로 표현하는 데이터

    // 변수처럼 생겼지만 변수가 아니고 객체의 속성, 필드다, 객체가 생성되면 처음에는 기본값으로 설정 된다.
    String dancerName; // 댄서 이름
    */
/*
        void foo() {
            String dancerName; // <- 이건 변수다.
        }
     *//*

    String crewName; // 소속 크루 이름
    String[] genres; // 장르 목록
    int danceLevel; // 0: 초보, 1: 아마추어, 2: 프로

    // 기능(메서드): 객체를 동사적으로 표현하는 함수
    // 설계도에 있는 함수는 static을 붙이지 않음

    // 춤추는 기능
    void dance() {
        System.out.printf("%s 댄서가 %s춤을 춥니다.\n", dancerName, genres[0]);
    }

    // 자기소개 기능
    void introduce() {
        System.out.println("이름: " + dancerName);
        System.out.println("팀명: " + crewName);
        System.out.println("장르: " + Arrays.toString(genres));
        System.out.println("레벨: " + danceLevel);
    }

    // 생성자: 객체가 생성될 때 자동 실행되는 특수 메서드
    // 생성자 이름 규칙 : 클래스 이름과 똑같이 해야 한다.
    // 하는일: 객체의 초기값을 세팅
    // 무조건 주소값 자동 리턴 그래서 안써도 된다
    Dancer() {
        System.out.println("댄서의 1번 생성자 호출!");
        dancerName = "무명의댄서";
        crewName = "잡크루";
        genres = new String[] {};
        danceLevel = 1;
//        return 주소값;
    }

    // 생성자 오버로딩: 생성자는 여러 개 만들 수 있다.
    // 규칙: 파라미터가 달라야 한다.
    Dancer(String dName) {
        System.out.println("2번 생성자 호출!");
        dancerName = dName;
        crewName = "똥크루";
        genres = new String[] {"힙합"};
        danceLevel = 0;
    }

    Dancer(String dName, String cName) {
        System.out.println("3번 생성자 호출");
        dancerName = dName;
        crewName = cName;
        genres = null;
        danceLevel = 2;
    }

    Dancer(String dName, String cName, String... settingGenres) {
        System.out.println("4번 생성자 호출!");
        dancerName = dName;
        crewName = cName;
        genres = settingGenres;
        danceLevel = 0;
    }

    // ... 어디까지가 배열인지 모르기 때문에 맨 뒤에 있어야 한다. []는 순서 상관이 없다.
    Dancer(String dName, String cName, int dLevel, String... settingGenres) {
        System.out.println("5번 생성자 호출!");
        dancerName = dName;
        crewName = cName;
        genres = settingGenres;
        danceLevel = dLevel;
    }

}*/
