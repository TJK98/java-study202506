package chap1_5.player;

public class Player {

    String nickName;
    int level;
    int hp;

    // 생성자: 캐릭터가 태어날 때 가져야할 값들을 세팅
    // 파라미터 이름과 필드의 이름이 같을 때 필드를 this로 구분한다. this가 없으면 지역 변수로 생각할 수 있다.
    Player(String nickName) {
        this.nickName = nickName;
        this.level = 1;
        this.hp = 100;
    }

    // 자바의 모든 메서드는 첫번 째 파라미터(this)가 생략되어 있음. this는 "나"라고 생각하면 편하다.
    // 다른 플레이어를 때릴 수 있는 기능
    void attack(/*Player this, */Player targetPlayer) {

        if (this == targetPlayer) {
            System.out.println("스스로를 공격할 수 없습니다.");
            return;
        }

        System.out.println("this = " + this);
        System.out.println("targetPlayer = " + targetPlayer);

        // 상대방의 체력이 10감소
        targetPlayer.hp -= 10;
        // 백 데미지로 내 체력도 5 감소
        this.hp -= 10;

        System.out.printf("%s님이 %s님을 때렸습니다.\n", this.nickName, targetPlayer.nickName);
        System.out.printf("공격자 남은 체력: %d, 타겟 남은 체력: %d\n", this.hp, targetPlayer.hp);
    }
}
