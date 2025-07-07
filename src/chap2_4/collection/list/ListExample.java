package chap2_4.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        /*
            List
            1. 순서가 있는 데이터 구조
            2. 중복 데이터 저장을 혀용

            종류: 배열 리스트, 연결 리스트
            배열 리스트 (전체 탐색 효율이 좋음, 삭제와 삽입에 비효율) - 읽기 전용
            연결 리스트 (탐색 속도가 좋지 않음, 중간 삭제, 삽입에 좋음) - 역방향이 안 됨
            양방향 연결 리스트
         */

        List<String> hobbies = new ArrayList<>();
        hobbies.add("수영");
        hobbies.add("축구");
        hobbies.add("영화감상");
        hobbies.add("낮잠");
        hobbies.addAll(List.of("밥 먹기", "노래 부르기")); // 한 번에 삽입

        System.out.println(hobbies);

        // 중간 삽입
        hobbies.add(1, "코딩");
        System.out.println(hobbies);

        int size = hobbies.size();
        System.out.println("size = " + size);

        // 인덱스 찾기
        int index1 = hobbies.indexOf("영화감상");
        System.out.println("index1 = " + index1);

        int index2 = hobbies.indexOf("맛집탐방");
        System.out.println("index2 = " + index2);

        // 요소 포함 여부
        boolean flag = hobbies.contains("코딩");
        System.out.println("flag = " + flag);

        // 요소 삭제
        hobbies.remove("수영");
        hobbies.remove(2);

        System.out.println(hobbies);

        // 요소 수정
        hobbies.set(0, "디자인");
        System.out.println(hobbies);

        // 요소 참조
        String hobby = hobbies.get(1);
        System.out.println("hobby = " + hobby);

        // 리스트 순회(반복문 처리)
        System.out.println("===========================");

        for (int i = 0; i < hobbies.size(); i++) {
            System.out.println(hobbies.get(i));
        }

        System.out.println("===========================");

        for (String h : hobbies) {
            System.out.println(h);
        }

        System.out.println("===========================");

        hobbies.forEach((hob) -> System.out.println(hobby));

        // 전체 삭제
        hobbies.clear();
        System.out.println(hobbies);
        System.out.println(hobbies.isEmpty());

        // 리시트에 초기값 넣고 시작하기
        System.out.println("===========================");
//        List<Integer> numbers = List.of(1, 3, 5, 7, 9); 수정이 안 된다
        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 5, 7, 9));

        numbers.add(11);

        System.out.println("numbers = " + numbers);

    }
}
