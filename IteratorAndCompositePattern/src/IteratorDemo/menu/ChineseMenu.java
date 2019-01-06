package IteratorDemo.menu;

import IteratorDemo.iterator.ChineseMenuIterator;
import IteratorDemo.iterator.Iterator;

/**
 * 中式餐厅，菜单使用数组存储
 */
public class ChineseMenu implements Menu {

    private String[] menuItems = new String[100];

    public ChineseMenu() {
        menuItems[0] = "三杯鸡";
        menuItems[1] = "左宗棠鸡";
        menuItems[2] = "宫保鸡丁";
        menuItems[3] = "冰糖炖猪蹄";
        menuItems[4] = "南乳焖猪手";
    }

    @Override
    public Iterator createIterator() {
        return new ChineseMenuIterator(menuItems);
    }
}
