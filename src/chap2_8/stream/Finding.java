package chap2_8.stream;

import static chap2_8.stream.Menu.menuList;

public class Finding {

    public static void main(String[] args) {

        // 요리 목록에서 채식주의자가 먹을 수 있는 요리가 하나라도 있는가?
        boolean flag1 = menuList.stream()
//                .filter(menu -> menu.getType() == DishType.MEAT)
                .anyMatch(menu -> menu.isVegetarian());

        System.out.println("flag1 = " + flag1);

        // 요리 목록에서 모든 요리가 1000 칼로리미만입니까?
        boolean flag2 = menuList.stream()
                .allMatch(m -> m.getCalories() < 1000);

        System.out.println("flag2 = " + flag2);

        // 요리 중에 첫번 째로 발견된 생선 요리 찾기 find
        /*List<Dish> firstFishDishes = menuList.stream()
                .filter(m -> m.getType() == DishType.FISH)
                .collect(Collectors.toList());

        System.out.println(firstFishDishes.get(0));*/

        Dish firstFishDishes = menuList.stream()
                .filter(m -> m.getType() == DishType.FISH)
                .findFirst()
                .get();

        System.out.println("firstFishDishes = " + firstFishDishes);
    }
}
