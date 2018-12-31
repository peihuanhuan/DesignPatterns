package demo;

public class Coffee extends CaffeinBeverage {

    @Override
    public void brew() {
        System.out.println("正在做咖啡");
    }

    @Override
    public void addCondiments() {
        System.out.println("加入牛奶和糖");
    }
}
