public class Test {
    public static void main(String[] agrs){
        DataCenter dataCenter=new DataCenter();
        Observer observer1=new Observer1();
        Observer observer2=new Observer2();
        Observer observer3=new Observer3();

        dataCenter.registerObserver(observer1);
        dataCenter.registerObserver(observer2);
        dataCenter.registerObserver(observer3);

        dataCenter.setData(2);
        System.out.println("----------------------------------------" );
        dataCenter.setData(3);
    }
}
