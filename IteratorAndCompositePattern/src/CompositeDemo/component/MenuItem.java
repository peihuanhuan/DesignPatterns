package CompositeDemo.component;

import CompositeDemo.iterator.NullIterator;

import java.util.Iterator;

/**
 * 菜单项，包括菜的名字与价钱
 */
public class MenuItem extends MenuComponent {

    private String name;
    private double price;


    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }


    @Override
    public void print() {
        System.out.println(name+"："+price+"元");
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
