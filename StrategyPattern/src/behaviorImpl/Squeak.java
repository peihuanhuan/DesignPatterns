package behaviorImpl;

import behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("鸭子吱吱叫" );
    }
}
