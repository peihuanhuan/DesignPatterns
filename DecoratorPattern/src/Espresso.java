/**
 * 浓缩咖啡，是一个具体的被装饰者
 */
public class Espresso  extends Beverage {

    public Espresso() {
        description = "浓缩咖啡";
    }

    @Override
    public double cost() {
        return 10;
    }
}
