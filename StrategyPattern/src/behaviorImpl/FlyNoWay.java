package behaviorImpl;

import behavior.FlyBehavior;

/**
 * 鸭子不会飞
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞" );
    }
}
