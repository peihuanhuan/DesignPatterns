import behaviorImpl.FlyWithWings;
import behaviorImpl.Squeak;

public class GreenDuck extends Duck{
    public GreenDuck() {
        flyBehavior=new FlyWithWings();
        quackBehavior=new Squeak();
    }

    @Override
    public void display() {
        System.out.println("我是绿鸭子" );
    }
}
