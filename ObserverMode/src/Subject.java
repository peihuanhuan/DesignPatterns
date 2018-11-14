/**
 * 主题（发布者）接口
 */
public interface Subject {
    /**
     * 注册一个订阅者
     * @param observer 订阅者
     */
    void registerObserver(Observer observer);

    /**
     * 删除一个订阅者
     * @param observer 订阅者
     */
    void removeObserver(Observer observer);

    /**
     * 主题发生变化时，通知所有订阅者
     */
    void notifyObservers();
}
