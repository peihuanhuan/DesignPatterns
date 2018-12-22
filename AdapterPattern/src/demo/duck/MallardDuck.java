package demo.duck;

import demo.duck.Duck;

/**
 * 野鸭
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("野鸭呱呱叫");
    }

    @Override
    public void fly() {
        System.out.println("野鸭在飞");
    }
}
