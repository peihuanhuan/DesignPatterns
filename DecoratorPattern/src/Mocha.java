/**
 * 摩卡  ，装饰者
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"，摩卡";
    }

    @Override
    public double cost() {
        return 2+beverage.cost();
    }
}
