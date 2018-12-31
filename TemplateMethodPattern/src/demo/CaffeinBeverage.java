package demo;

/**
 * 咖啡因饮料超类
 */
public abstract class CaffeinBeverage {

    /**
     *  这是算法的骨架
     *  准备烹饪方法
     */
    public final void prepareRecipe(){

        boilWater();
        //抽象方法，需要子类实现
        brew();
        pourInCup();
        //如果需要添加调料
        if(customerWantCondiments()){
            addCondiments();
        }

    }

    //烧水
    public final void boilWater() {
        System.out.println("烧水...");
    }

    //酿，酿造
    public abstract void brew();

    //倒入杯子
    public final void pourInCup(){
        System.out.println("倒入杯中");
    }

    //加入调料
    public abstract void addCondiments();

    //选择是否加入调料,这是一个钩子，子类可以选择重写，默认添加调料
    public boolean customerWantCondiments(){
        return true;
    }
}
