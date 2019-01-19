package dynamicProxy;

public class Fish implements Swim {
    @Override
    public void swim() {
        System.out.println("fish is swimming");
    }
}
