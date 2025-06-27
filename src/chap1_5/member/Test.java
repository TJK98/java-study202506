package chap1_5.member;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        /*Member m1 = new Member("1234abc!", "TJK", "tjk98@gmail.com", Gender.MALE, 10);
        System.out.println("m1 = " + m1);*/

        // 클래스 안에 있는 데이터는 반드시 객체 생성을 통해 접근함
        MemberRepository mr = new MemberRepository();

        // 맴버 추가 테스트
        mr.addMember(new Member("0807", "wang", "wang@gmail.com",Gender.MALE, 27));

        System.out.println(Arrays.toString(mr.getMembers()));
        System.out.println(mr.size());

        System.out.println("=========================================");

        Member foundMember = mr.findMemberByEmail("wang@gmail.com");
        System.out.println("foundMember = " + foundMember);

        System.out.println("=========================================");
        boolean flag = mr.isDuplicateEamil("choi@naver.com");
        System.out.println("flag = " + flag);

    }
}
