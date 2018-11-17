/**
 * 牛奶 ，装饰者
 */
public class Mik extends CondimentDecorator {

    private Beverage beverage;

    public Mik(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"，牛奶";
    }

    @Override
    public double cost() {
        return 3+beverage.cost();
    }
}
