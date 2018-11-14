import java.util.ArrayList;
import java.util.List;

/**
 * 这是一个主题，每当data发生变化，就会通知所有订阅者
 */
public class DataCenter implements Subject {

    /**
     * 订阅者们关心的数据
     */
    private int data;
    /**
     * 主题需要维护一个订阅者的数组
     */
    private List<Observer> observers;

    public DataCenter() {
        observers=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i=observers.indexOf(observer);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(data);
        }
    }

    void dataChanged(){
        notifyObservers();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
        //数据发生改变，通知订阅者
        dataChanged();
    }


}
