package staticProxy;

public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void play() {
        System.out.println("~~~~~~代理前的行为~~~~~~");
        subject.play();
        System.out.println("~~~~~~代理后的行为~~~~~~");
    }
}
