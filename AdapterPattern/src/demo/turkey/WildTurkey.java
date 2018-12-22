package demo.turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("火鸡咯咯叫");
    }

    @Override
    public void fly() {
        System.out.println("火鸡飞");
    }
}
