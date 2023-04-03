package com.codestates.coffee;
import com.codestates.DependencyConfig;

public class CoffeeTest {
    public static void main(String[] args) {

        DependencyConfig dependencyConfig = new DependencyConfig();
        CoffeeService coffeeService = dependencyConfig.coffeeService();

        Coffee coffee = new Coffee(0L, "바닐라 라떼", "vanilla latte", 5000);

        coffeeService.creatCoffee(coffee);

        if(coffeeService.getCoffee(0L).getKorName().equals(coffee.getKorName())){
            System.out.println(coffee.getKorName() + "가 등록되었습니다");
        }

        coffeeService.editCoffee(0L,"바닐라 라떼",3000);

        if(coffeeService.getCoffee(0L).getPrice() == 3000){
            System.out.println("바닐라 라떼의 금액이 정상적으로 변경되었습니다.");
        }
        coffeeService.removeCoffee(0L);

        if(coffeeService.getCoffee(0L) == null){
            System.out.println("바닐라 라떼가 정상적으로 삭제되었습니다.");
        }
    }
}
