package demo.pizzaStore;

import demo.ingredientFactory.ChicagoPizzaIngredientFactory;
import demo.pizza.CheesePizza;
import demo.pizza.Pizza;

/**
 * 芝加哥风味披萨店
 */
public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza=null;

        //创建芝加哥风味的原料工厂
        ChicagoPizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("芝加哥风味CheesePizza");
        }else if(type.equals("另外一种pizza，我没实现")){
            pizza = null;
        }
        return pizza;
    }
}
