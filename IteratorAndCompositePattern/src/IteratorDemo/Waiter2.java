package IteratorDemo;

import IteratorDemo.iterator.Iterator;
import IteratorDemo.menu.Menu;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类2
 * 相比于第一个服务员，她也使用了迭代器，这样就不需要有几个menu就手动调用几次print方法了
 * 两个餐厅合并成一个餐厅了，需要依次打印两个菜单
 */
public class Waiter2 {


    private List<Menu> menus = new ArrayList<>();

    public void addMenu(Menu menu) {
        menus.add(menu);
    }


    public void printMenus() {
        java.util.Iterator iterator = menus.iterator();
        while (iterator.hasNext()) {
            Menu menu = (Menu) iterator.next();
            print(menu.createIterator());
        }
    }

    private void print(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
