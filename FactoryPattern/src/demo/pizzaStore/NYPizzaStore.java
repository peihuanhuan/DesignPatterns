package demo.pizzaStore;

import demo.ingredientFactory.NYPizzaIngredientFactory;
import demo.ingredientFactory.PizzaIngredientFactory;
import demo.pizza.CheesePizza;
import demo.pizza.Pizza;


/**
 * 纽约风味披萨店
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        //创建纽约风味的原料工厂
        PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("纽约风味CheesePizza");
        }else if(type.equals("另外一种pizza，我没实现")){
            pizza = null;
        }
        return pizza;
    }
}
