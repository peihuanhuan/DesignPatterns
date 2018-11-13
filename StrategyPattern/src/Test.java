import behaviorImpl.MuteQuack;
import behaviorImpl.Quack;

public class Test {
    public static void main(String[] args){
        Duck greenDuck=new GreenDuck();
        Duck redDuck=new RedDuck();

        //绿鸭子演示
        greenDuck.display();
        greenDuck.performQuack();
        greenDuck.performFly();

        System.out.println("------------------------------------------" );

        //红鸭子演示
        redDuck.display();
        redDuck.performQuack();
        redDuck.performFly();
        //红鸭子修改叫的动作
        redDuck.setQuackBehavior(new Quack());
        redDuck.performQuack();
    }
}
