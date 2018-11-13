package behaviorImpl;

import behavior.FlyBehavior;

/**
 * 鸭子会飞
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我会用翅膀飞" );
    }
}
