package chap1_6.modi.pac2;

// 패키지가 다르면 그냥은 쓰지 못하고 import를 써야한다.
import chap1_6.modi.pac1.A;

// A 클래스와 다른 패키지
public class C {

    C () {
        new A();
//        new A(200);
//        new A(6.66);

        a.f1 = 100;
//        a.f2 = 200;
//        a.f3 = 300;

        a.m1();
//        a.m2();
//        a.m3();
    }
}
