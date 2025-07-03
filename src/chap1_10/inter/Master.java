package chap1_10.inter;

// 동물들의 주인
public class Master {

    // 동물에게 사냥을 명령
    public void letsHunt(Huntable animal) {
        animal.hunt();
    }
    public void letsPlay(Pet animal) {
        animal.handle();
    }
}
