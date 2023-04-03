package com.codestates.coffee;

public class CoffeeService {

    private final CoffeeReposistoty coffeeReposistoty;
    public CoffeeService(CoffeeReposistoty coffeeReposistoty){
        this.coffeeReposistoty = coffeeReposistoty;
    }


    public void creatCoffee(Coffee coffee){
        coffeeReposistoty.postCoffee(coffee);
    }
    public Coffee editCoffee(Long coffeeId, String korName,int price){
        return coffeeReposistoty.patchCoffee(coffeeId,korName,price);
    }

    public Coffee getCoffee(Long coffeeId){
        return coffeeReposistoty.getCoffee(coffeeId);
    }

    public void removeCoffee(Long coffeeId){
        coffeeReposistoty.deleteCoffee(coffeeId);
    }
}
