package com.codestates.coffee;

import org.springframework.boot.web.server.Cookie;

import java.util.HashMap;
import java.util.Map;

public class CoffeeReposistoty {
    private final Map<Long,Coffee> coffeeMenu = new HashMap<>();

    //커피 주문
    public void postCoffee(Coffee coffee){
        coffeeMenu.put(coffee.getCoffeeId(),coffee);
    }

    //주문 가격 수정
    public Coffee patchCoffee(Long coffeeId, String korName,int price){
        Coffee drink = coffeeMenu.get(coffeeId);
        drink.setKorName(korName);
        drink.setPrice(price);

        return coffeeMenu.put(coffeeId,drink);
    }


    //커피 주문 확인
    public Coffee getCoffee(Long coffeeID){
        return coffeeMenu.get(coffeeID);
    }
    // 주문 취소
    public void deleteCoffee(Long coffeeID){
        coffeeMenu.remove(coffeeID);
    }
}
