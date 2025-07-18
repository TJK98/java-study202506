package chap1_2.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;
        int n3 = 30;

        // 배열
        // 1. 동종 모음 구조 (같은 타입끼리만 저장 가능)
        // 2. 생성시의 크기가 불변함 (값을 안 넣으면 기본값 초기화)

        // 1. 배열 변수를 선언 (스택에 변수 저장)
        int[] numbers; // 4byte (x)
        // 2. 배열을 생성 (힙에 데이터를 저장)
        numbers = new int[5];
        // 3. 배열을 초기화(저장)
        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int) 66.7;
        numbers[3] = numbers[0] * 2;
        numbers[4] = 99;

        System.out.println("numbers = " + numbers); // 배열이 나오지 않고 주소가 나옴
        System.out.println(Arrays.toString(numbers)); // 배열을 확인하려면 toString(), import java.util.Arrays;가 필요
        System.out.println(numbers.length); // 배열 길이 확인

        // 배열 순회
        System.out.println("==========================");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("데이터 = " + numbers[i]);
        }

        System.out.println("==========================");

        // enhanced for loop (iter)
        for (int n : numbers) {
            System.out.println("n = " + n);
        }

        // number.forEach
        Arrays.stream(numbers).forEach(n -> System.out.println(n));

        System.out.println("==========================");

        // 배열 단축 생성 문법
        // String[] pets = new String[] {"뽀삐", "나비", "춘식이"};

        // 변수를 선언할 때만 new Type[] 생략 가능
        String[] pets = {"뽀삐", "나비", "춘식이"};
        pets = new String[] {"삐뽀", "비나", "식춘이"}; // new String[] 생략 불가

        System.out.println(Arrays.toString(pets));

        foo(new String[] {"haha", "hoho"}); // new String[] 생략 불가

        System.out.println("==========================");

        /*
            # 배열의 기본 값
            자바의 배열은 생성되는 순간 해당 공간에 기본값들을 채워넣음
            정수형: 0
            실수형: 0.0
            논리형: false
            문자형: ''
            기타(String): null
        */
        byte[] bArr = new byte[3];
        System.out.println(Arrays.toString(bArr));

        double[] dArr = new double[4];
        System.out.println(Arrays.toString(dArr));

        boolean[] blArr = new boolean[3];
        System.out.println(Arrays.toString(blArr));

        char[] cArr = new char[3];
        System.out.println(Arrays.toString(cArr));

        // 기본 타입 (정수, 실수, 논리, 문자-char)
        // 나머지 참조 타입 (주소를 저장하는 변수 - 포인터)
        String[] sArr = new String[3];
        System.out.println(Arrays.toString(sArr));

        Scanner[] scanners = new Scanner[3];
        System.out.println(Arrays.toString(scanners));

    } // end main
    static void foo(String[] sArr) {

    }
}
