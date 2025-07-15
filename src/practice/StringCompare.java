/*
package chap1_3;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        // String을 ==이 아닌 .equals()로 비교해야 되는 이유
        String str1 = "김철수"; // String은 객체다. 원래는 String str1 = new String("김철수");가 맞지만 단축 문법으로 쓸 수 있다.
        String str2 = "김철수";
        String str3 = new String("김철수"); // new String();을 쓰면 새로운 힙 영역과 리터럴이 생성이되고 스텍이 힙을 가르키고 힙이 리터럴 영역을 가르킨다.

        System.out.println("str1 == str2 : " + (str1 == str2)); // true, new String();을 생략하면 리터럴 배열 중 같은 것이 존재하나 확인을 한다. 그리고 힙에 해당 String 객체가 존재하는 지 확인을 한 후 존재 하면 생성하지 않고 재활용하여 같은 주소가 저장하고 같은 포인트를 가리킨다.
        System.out.println("str1 == str3 : " + (str1 == str3)); // false, 새로의 주소값이 다르기 때문에 false다.

        // 때문에 == 비교는 같은 문자더라도 false가 나올 가능성이 있기 때문에 쓰면 안 된다.

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        Scanner sc = new Scanner(System.in);

        System.out.println("================");
        String inputName = sc.nextLine();
        String myName = "홍길동";

        System.out.println("inputName = " + inputName);
        System.out.println("myName = " + myName);

        System.out.println("inputName = myName: " + (inputName == myName)); // false, sc.nextLine이 String을 리턴하기 때문에 리터럴이 아닌 새로 생긴 String이다.
        System.out.println("inputName = myName: " + (inputName.equals(myName))); // true, 한 글자 씩 for문을 돌려 비교를 해주는 것이 .equals()이다.

    }
}

*/