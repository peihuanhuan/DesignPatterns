package dynamicProxy;

public class Bird implements Fly {

    @Override
    public void fly() {
        System.out.println("bird is flying");
    }
}
