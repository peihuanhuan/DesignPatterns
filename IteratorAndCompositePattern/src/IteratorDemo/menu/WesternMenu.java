package IteratorDemo.menu;

import IteratorDemo.iterator.Iterator;
import IteratorDemo.iterator.WesternMenuIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 西式餐厅，菜单使用ArrayList存储
 */
public class WesternMenu implements Menu {

    private List<String> menuItems = new ArrayList<>();


    public WesternMenu() {
        menuItems.add("奶油蘑菇汤");
        menuItems.add("凯撒沙拉");
        menuItems.add("西班牙土豆煎饼");
        menuItems.add("黑椒猪扒");
        menuItems.add("金枪鱼火腿pizza");
    }

    @Override
    public Iterator createIterator() {
        return new WesternMenuIterator(menuItems);
    }


}
