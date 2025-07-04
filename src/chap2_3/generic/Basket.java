package chap2_3.generic;

/*
    이건 바구니의 설계도고 아직 뭘 담을지는 모른다
    근데 아무튼 과일을 담을 것이다.
    F는 과일을 의미, 이게 대체 무슨 과일이냐? 설계도는 모른다
    F는 바구니가 만들어진 다음에 결정됨
 */

public class Basket<F extends Fruit> {

    private F fruut;

    public F getFruut() {
        return fruut;
    }

    public void setFruut(F fruut) {
        this.fruut = fruut;
    }
}
