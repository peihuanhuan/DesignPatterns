package staticProxy;

public class RealSubject implements Subject {

    @Override
    public void play() {
        System.out.println("我是真实的主题中的行为");
    }
}
