package CompositeDemo.component;

import CompositeDemo.UnSupportedOperationException;
import CompositeDemo.iterator.NullIterator;

import java.util.Iterator;

/**
 * 菜单组件，包括菜单项和菜单
 */
public abstract class MenuComponent {

    // 这个方法是菜单项的
    public String getName() throws UnSupportedOperationException {
        throw new UnSupportedOperationException();
    }

    // 这个方法是菜单项的
    public double getPrice() throws UnSupportedOperationException {
        throw new UnSupportedOperationException();
    }

    // 这个方法是菜单的
    public MenuComponent getChild(int pos) throws UnSupportedOperationException {
        throw new UnSupportedOperationException();
    }

    // 这个方法是菜单的
    public void addItem(MenuComponent menuComponent) throws UnSupportedOperationException {
        throw new UnSupportedOperationException();
    }

    // 通用方法
    public void print() {

    }

    public Iterator createIterator() {
        return new NullIterator();
    }

}
