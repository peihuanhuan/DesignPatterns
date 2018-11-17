/**
 * 奶泡，装饰者
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"，奶泡";
    }

    @Override
    public double cost() {
        return 1+beverage.cost();
    }
}
