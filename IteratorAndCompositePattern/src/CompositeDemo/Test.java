package CompositeDemo;

import CompositeDemo.component.Menu;
import CompositeDemo.component.MenuItem;

public class Test {

    public static void main(String[] args) {

        Menu allMenus = new Menu("总餐厅");

        //中式餐厅
        Menu chineseMenu = new Menu("中式餐厅");
        chineseMenu.addItem(new MenuItem("三杯鸡",18));
        chineseMenu.addItem(new MenuItem("左宗棠鸡",28));
        chineseMenu.addItem(new MenuItem("宫保鸡丁",38));
        //西式餐厅
        Menu westernMenu = new Menu("西式餐厅");
        westernMenu.addItem(new MenuItem("奶油蘑菇汤",23));
        westernMenu.addItem(new MenuItem("凯撒沙拉",13));
        westernMenu.addItem(new MenuItem("金枪鱼火腿pizza",33));
        //西式餐厅的 饮料菜单
        Menu westernDrinkMenu = new Menu("西式饮料");
        westernDrinkMenu.addItem(new MenuItem("果香热红酒 ",22));
        westernDrinkMenu.addItem(new MenuItem("英式丝袜奶茶 ",8));
        westernMenu.addItem(westernDrinkMenu);

        allMenus.addItem(chineseMenu);
        allMenus.addItem(westernMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printCheapMenu();

    }

}
