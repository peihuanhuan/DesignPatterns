import behavior.FlyBehavior;
import behavior.QuackBehavior;
import behaviorImpl.FlyNoWay;
import behaviorImpl.MuteQuack;

public class RedDuck extends Duck {

    public RedDuck() {
        flyBehavior=new FlyNoWay();
        quackBehavior=new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("我是红鸭子" );
    }
}
