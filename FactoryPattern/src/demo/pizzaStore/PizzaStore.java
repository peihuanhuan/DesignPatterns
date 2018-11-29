package demo.pizzaStore;

import demo.pizza.Pizza;

/**
 * 声明一个工厂方法
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){

        Pizza pizza;

        pizza = createPizza(type);


        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
