public class Observer1 implements Observer {
    @Override
    public void update(Object o) {
        int i=(Integer ) o;
        System.out.println("1号订阅者收到消息，数据变为"+i );
    }
}
