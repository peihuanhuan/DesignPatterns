package demo;

import demo.pizza.Pizza;
import demo.pizzaStore.ChicagoPizzaStore;
import demo.pizzaStore.NYPizzaStore;
import demo.pizzaStore.PizzaStore;

public class Test {

    public static void main(String[] args){
        System.out.println("----------定一个纽约风味的CheesePizza----------");
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza.toString());

        System.out.println();

        System.out.println("----------定一个芝加哥风味的CheesePizza----------");
        nyPizzaStore = new ChicagoPizzaStore();
        pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza.toString());
    }
}
