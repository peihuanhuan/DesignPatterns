/**
 * 饮料抽象类，所有装饰者与被装饰者的基类
 */
public abstract class Beverage {

    //饮料描述
    protected String description;

    public String getDescription() {
        return description;
    }
    //计算饮料的花费
    public abstract double cost();
}
