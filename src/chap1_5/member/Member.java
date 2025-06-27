package chap1_5.member;

import java.time.LocalDateTime;
import java.util.UUID;

// 역할: 회원 한 명의 회원 정보를 잘 가지고 있어야 함
public class Member {
    String email; // 본질 식별자
    String password;
    String memberName;
    String id; // 인조 식별자 ( -> 랜덤값: 시스템이 자동 생성, 식별자가 가능 할려면 필수값이여야 한다. 값이 바뀌면 안 된다. 민감 정보나 개인 정보는 유출하면 안 된다)
    Gender gender;
    int age;
    LocalDateTime registerDate; // 회원 가입 일시

    // boolean isdeleted = false;

    // 생성자 : 객체가 처음 생성될 떄 필드를 초기화
    @Override
    public String toString() {
        return "member{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", memberName='" + memberName + '\'' +
                ", id='" + id + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", registerDate=" + registerDate +
                '}';
    }

    public Member(String password, String memberName, String email, Gender gender, int age) {
        this.password = password;
        this.memberName = memberName;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.id = UUID.randomUUID().toString();
        this.registerDate = LocalDateTime.now();
    }

    /**
     * 회원의 상세정보를 출력하는 메서드입니다.
     *
     * 이 메서드는 회원의 이름, 이메일, 성별, 나이, 그리고 회원가입 날짜를
     * 지정된 형식에 따라 콘솔에 출력합니다. 출력 형식은 다음과 같습니다:
     * "이름: [이름], 이메일: [이메일], 성별: [성별], 나이: [나이]세, 가입일: [가입일]"
     *
     * 기능:
     * 1. 가입일을 "yyyy-MM-dd HH:mm" 형식으로 변환합니다.
     * 2. 회원의 정보를 지정된 출력 형식에 맞춰 출력합니다.
     */
    public void inform() {
        String formattedDate = registerDate.format(
                java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
        );
        System.out.printf("이름: %s, 이메일: %s, 성별: %s, 나이: %d세, 가입일: %s\n",
                memberName, email, gender, age, formattedDate);
    }
}
