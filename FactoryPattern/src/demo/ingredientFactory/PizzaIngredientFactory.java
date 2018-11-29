package demo.ingredientFactory;

import demo.Ingredient.Cheese;
import demo.Ingredient.Dough;
import demo.Ingredient.Sauce;

/**
 * 批萨成分抽象工厂
 */
public interface PizzaIngredientFactory {

    Dough createDough();        //面团
    Sauce createSauce();        //酱料
    Cheese createCheese();    //奶酪

    /**
     *  ...............还会有其它原料有区别，这里就写三个了
     */

}
