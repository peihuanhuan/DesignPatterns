package demo;

import demo.adapter.TurkeyAdapter;
import demo.duck.Duck;
import demo.duck.MallardDuck;
import demo.turkey.Turkey;
import demo.turkey.WildTurkey;

public class Test {


    public static void main(String[] args) {


        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        //将火鸡塞进火鸡适配器中，让它看起来像一只鸭子
        Duck fakeDuck = new TurkeyAdapter(turkey);

        System.out.println("~~~~~~~~~~~~~~~~~~真的鸭子的动作~~~~~~~~~~~~~~~~~~");
        duck.quack();
        duck.fly();

        System.out.println("~~~~~~~~~~~~~~~实际是火鸡的鸭子的动作~~~~~~~~~~~~~");
        fakeDuck.quack();
        fakeDuck.fly();
    }

}
