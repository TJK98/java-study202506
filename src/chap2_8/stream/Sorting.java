package chap2_8.stream;

import java.util.List;

import static chap2_8.stream.DishType.MEAT;
import static chap2_8.stream.Menu.menuList;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Sorting {

    public static void main(String[] args) {

        // 육류 요리 중 칼로리가 낮은 순으로 정렬하기
        List<Dish> lowCalorieMeats = menuList.stream()
                .filter(menu -> menu.getType() == MEAT)
                .sorted(comparing(Dish::getCalories))
                .collect(toList());

        lowCalorieMeats.forEach(System.out::println);

        System.out.println("================================");

        // 메뉴들을 이름 내림차로 정렬 (zyx 순서대로)
        List<Dish> menuSortedByName = menuList.stream()
                .sorted(comparing(Dish::getName).reversed())
                .collect(toList());

        menuSortedByName.forEach(System.out::println);

        System.out.println("================================");

        // 300 칼로리 이상인 요리 중 칼로리가 낮은 탑 3 요리를 필터
        menuList.stream()
                .filter(menu -> menu.getCalories() >= 300)
                .sorted(comparing(Dish::getCalories))
                .limit(3)
                .forEach(System.out::println);
    }
}
