import behavior.FlyBehavior;
import behavior.QuackBehavior;

public abstract class Duck {
    //鸭子两个动作的接口
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    //鸭子飞行动作
    public  void performFly(){
        flyBehavior.fly();
    }

    //鸭子鸣叫动作
    public void performQuack(){
        quackBehavior.quack();
    }

    public Duck() {
    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    //抽象方法
    public abstract void display();

    //所有鸭子都有的方法，即不变的地方
    public void swim(){
        System.out.println("所有的鸭子都会游泳" );
    }

    //设置接口
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
