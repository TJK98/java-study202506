package chap1_2.array;

import java.util.Arrays;

// 2차원 배열
public class Matrix {

    public static void main(String[] args) {

        /*
            [
                [1,2,3],
                [4,5,6],
                [7,8,9]
            ]
         */

        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println("2차원 배열의 값: " + Arrays.toString(matrix));
        System.out.println("0번인덱스의 주소: " + matrix[0]);
        System.out.println("1번인덱스의 주소: " + matrix[1]);
        System.out.println("2번인덱스의 주소: " + matrix[2]);

        System.out.println("===========");

        System.out.println(matrix[0][2]);
        // 2차원 배열 속 1차원 배열의 값 보기
        System.out.println(Arrays.toString(matrix[0]));

        // 각 배열의 주소값
        System.out.println(Arrays.toString(matrix));
        // 각 배열의 내부값
        System.out.println(Arrays.deepToString(matrix));

        System.out.println("==========");

        // 2차원 배열 순회, for문을 2번 돌려야 한다.
        // iter 방식
        for (int[] arr : matrix) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        // fori 방식
        for (int i = 0; i < matrix.length; i++) {
            int[] arr = matrix[i];
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

        // 빈 2차원 배열
        // 3행 4열
        System.out.println("===============");
        int[][] arr2d = new int[3][4];
        for (int[] ints : arr2d) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        // 3차원
        int[][][] arr3d = {
                {
                        {}, {}
                },
                {
                        {}, {}
                }
        };
    }
}