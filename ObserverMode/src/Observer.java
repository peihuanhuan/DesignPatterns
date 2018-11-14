/**
 * 订阅者接口
 */
public interface Observer {
    /**
     * 发布者发布消息时会调用此方法
     * @param o 发布的消息
     */
    void update(Object o);
}
