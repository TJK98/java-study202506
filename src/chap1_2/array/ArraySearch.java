package chap1_2.array;

// 배열 탐색 : 선형(순차) 탐색
public class ArraySearch {
    public static void main(String[] args) {
        // 배열의 인덱스 탐색과 요소 유무를 확인
        String[] foods = {"족발", "파스타", "치킨", "삼겹살"};

        String target = "치킨";

        // 선형 탐색 : 0변부터 일일히 순차적으로 체크
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            // 자바의 문자열 비교는 == 가 아닌 .equals(), == 는 주소 비교이다.
            if (foods[i].equals(target)) {
                index = i;
                break;
            }
        }
        // 유무 확인
        boolean isPresent = index != -1;

        System.out.println("타겟의 인덱스: " + index);
        System.out.println("타겟의 유무: " + isPresent);
    }
}
