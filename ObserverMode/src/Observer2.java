public class Observer2 implements Observer {
    @Override
    public void update(Object o) {
        int i=(Integer ) o;
        System.out.println("2号订阅者收到消息，数据变为"+i );
    }
}
