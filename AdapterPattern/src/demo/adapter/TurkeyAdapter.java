package demo.adapter;

import demo.duck.Duck;
import demo.turkey.Turkey;

/**
 * 鸭子🦆不够用了，拿火鸡🦃充数
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        //火鸡要飞好几次才能和鸭子一样远
        turkey.fly();
        turkey.fly();
        turkey.fly();
    }
}
