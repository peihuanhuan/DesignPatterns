package IteratorDemo;

import IteratorDemo.iterator.Iterator;
import IteratorDemo.menu.ChineseMenu;
import IteratorDemo.menu.Menu;
import IteratorDemo.menu.WesternMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类
 * 两个餐厅合并成一个餐厅了，需要依次打印两个菜单
 */
public class Waiter {

    private Menu chineseMenu;
    private Menu westernMenu;

    private List<Menu> menus = new ArrayList<>();

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public Waiter(Menu chineseMenu, Menu westernMenu) {
        this.chineseMenu = chineseMenu;
        this.westernMenu = westernMenu;
    }

    public void printMenus() {

        Iterator westernMenuIterator = westernMenu.createIterator();
        Iterator chineseMenuIterator = chineseMenu.createIterator();

        System.out.println("~~~~~~~~~~~~~西式餐厅菜单~~~~~~~~~~~~");
        print(westernMenuIterator);
        System.out.println("\n~~~~~~~~~~~~~中式餐厅菜单~~~~~~~~~~~~");
        print(chineseMenuIterator);
    }

    private void print(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
