package CompositeDemo.component;

import CompositeDemo.UnSupportedOperationException;
import CompositeDemo.iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 菜单，菜单可能包括菜单项以及子菜单
 */
public class Menu extends MenuComponent {

    private String name;

    private List<MenuComponent> menuItems = new ArrayList<>();


    public Menu(String name) {
        this.name = name;
    }

    @Override
    public MenuComponent getChild(int pos) {
        if (pos < 0 || pos > menuItems.size()-1) {
            return null;
        } else {
            return menuItems.get(pos);
        }
    }

    @Override
    public void addItem(MenuComponent menuComponent) {
        menuItems.add(menuComponent);
    }

    @Override
    public void print() {
        System.out.println("\n~~~~~~"+name+"~~~~~");
        for (MenuComponent component : menuItems) {
            component.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuItems.iterator());
    }
}
