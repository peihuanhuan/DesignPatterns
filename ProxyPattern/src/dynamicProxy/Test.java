package dynamicProxy;


public class Test {


    public static void main(String[] args) {

        AnimalProxy proxy = new AnimalProxy();
        Fly birdProxy = (Fly) proxy.getInstance(new Bird());
        birdProxy.fly();

        System.out.println();

        Swim swimProxy = (Swim) proxy.getInstance(new Fish());
        swimProxy.swim();

    }
}
