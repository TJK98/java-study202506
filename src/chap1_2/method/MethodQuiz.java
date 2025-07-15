package chap1_2.method;

import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"떡볶이", "치킨", "파스타"};

    public static void main(String[] args) {

        printFoods();

        push("라면");
        push("김치찌개");
        push("짬뽕", "닭강정");

        printFoods();


        int index = indexOf("파스타");
        System.out.println("index = " + index);
        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        pop();
        remove("치킨");
        remove(0);

        printFoods();

        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);
        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(1, "파인애플");

        printFoods();

        modify(2, "닭갈비");

        printFoods();
    } // end main

    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    static boolean isOutOfBounds(int index) {
        if (index < 0 || index >= foods.length) {
            System.out.println("인덱스의 범위가 잘못되었습니다. (index: " + index + ")");
            return true;
        }
        return false;
    }

    // push와 pop의 재활용성을 위한 copy 함수
    // capacity에 양의 정수를 넣으면 push -1을 넣으면 pop
    static String[] copy(int capacity) {
        String[] tempArray = new String[foods.length + capacity];

        // 루프 회전수는 사이즈를 늘릴 때는 원본만큼
        // 줄였을 때는 줄인 만큼 회전
        int loopCount = (capacity >= 0) ? foods.length : tempArray.length;
        for (int i = 0; i < loopCount; i++) {
            tempArray[i] = foods[i];
        }
        return tempArray;
    }

    static void push(String... items) {
        // 1. 사이즈가 1개 더 큰 배열을 생성
        // 2. 원본 내용을 복사
        String[] temp = copy(items.length);

        // 3. 배열에 맨 끝에 데이터 추가
        for (int i = 0; i < items.length; i++) {
            temp[temp.length - (items.length - i)] = items[i];
        }
        // 4. 주소값 이전
        foods = temp;
        // temp = null; 을 안 해줘도 된다. temp가 지역 변수이기 때문에
    }

    static String pop() {
        // safety coding: pop을 계속하고 제거할 대상이 없으면 오류가 생긴다.
        if (foods.length == 0) {
            System.out.println("제거할 대상이 없습니다.");
            // 그냥 return;은 void 함수에서만 쓸 수 있다.
            return null;
        }
        // pop 된 대상이 뭔지 보여줄려면 copy하기 전에 삭제될 마지막 데이터를 저장해야 된다.
        String deleted = foods[foods.length - 1];

        foods = copy(-1);
        return deleted;
    }

    static int indexOf(String item) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    static boolean include(String item) {
        return indexOf(item) != -1;
    }

    // 배열 저장값으로 찾아서 삭제
    static void remove(String targetItem) {

        if (!include(targetItem)) return;

        for (int i = indexOf(targetItem); i < foods.length - 1; i++) {
            foods[i] = foods[i + 1];
        }
        pop();
    }

    // 오버로딩 : 같은이름의 메서드를 계속 만드는 행위, 파라미터 타입이 달라야 한다.
    static void remove(int targetIndex) {
        if (isOutOfBounds(targetIndex)) return;
        remove(foods[targetIndex]);
    }

    static void insert(int index, String item) {
        if (isOutOfBounds(index)) return;
        String[] temp = copy(1);
        for (int i = foods.length; i > index; i--) {
            temp[i] = temp[i - 1];
        }
        temp[index] = item;
        foods = temp;
    }

    static void modify(int index, String item) {
        if (isOutOfBounds(index)) return;
        foods[index] = item;
    }

}