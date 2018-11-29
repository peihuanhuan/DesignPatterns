package demo.pizza;

import demo.ingredientFactory.PizzaIngredientFactory;

/**
 * 这是一种pizza，但有两种分类，纽约风味和芝加哥风味。其实两种风味的原材料都是一样的，
 * 面团+酱料+芝士 ，唯一差别是区域性的原料，做法都是一样的。
 * 所以我们不需要为一种pizza准备多个类（因为多个风味），让原料工厂处理这种区域差异就可以了。
 */
public class CheesePizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;


    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;

        prepare();
    }

    @Override
    void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
