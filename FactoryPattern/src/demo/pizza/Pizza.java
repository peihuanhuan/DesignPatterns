package demo.pizza;

import demo.Ingredient.Cheese;
import demo.Ingredient.Dough;
import demo.Ingredient.Sauce;

/**
 * 批萨抽象类
 */
public abstract class Pizza {

    private String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;

    /**
     * 在这个方法中，我们需要收集pizza所需要的原理，而这些原料当然来自原料工厂了
     */
    abstract void prepare();

    public void bake(){
        System.out.println("批萨烘烤中.............烘烤完成" );
    }

    public void cut(){
        System.out.println("批萨切片中.............切片完成" );
    }

    public void box(){
        System.out.println("批萨打包中.............打包完成" );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name+"："+dough.name()+"，"+sauce.name()+"，"+cheese.name() ;
    }
}
