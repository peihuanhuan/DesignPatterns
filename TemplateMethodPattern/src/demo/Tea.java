package demo;

public class Tea extends CaffeinBeverage {
    @Override
    public void brew() {
        System.out.println("冲茶中");
    }

    @Override
    public void addCondiments() {

    }

    //不添加调料
    @Override
    public boolean customerWantCondiments() {
        return false;
    }
}
