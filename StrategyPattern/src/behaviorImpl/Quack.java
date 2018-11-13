package behaviorImpl;

import behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("鸭子呱呱的叫" );
    }
}
