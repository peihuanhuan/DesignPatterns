package IteratorDemo;

import IteratorDemo.menu.ChineseMenu;
import IteratorDemo.menu.Menu;
import IteratorDemo.menu.WesternMenu;

public class Test {

    public static void main(String[] args) {

        Menu chineseMenu = new ChineseMenu();
        Menu westernMenu = new WesternMenu();

        Waiter waiter = new Waiter(chineseMenu,westernMenu);


        waiter.printMenus();
        System.out.println(Integer.MIN_VALUE+Integer.MIN_VALUE > Integer.MIN_VALUE);
    }
}
