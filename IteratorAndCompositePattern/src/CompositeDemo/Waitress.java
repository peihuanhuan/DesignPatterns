package CompositeDemo;

import CompositeDemo.component.MenuComponent;

import java.util.Iterator;

public class Waitress {

    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    //只打印价格低于20的菜单 （ 或者其他你想打印的菜单 ）
    public void printCheapMenu() {
        Iterator iterator = allMenus.createIterator();

        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.getPrice() < 20d) {
                    menuComponent.print();
                }
            } catch (UnSupportedOperationException e) {
                e.printStackTrace();
            }
        }
    }
}
