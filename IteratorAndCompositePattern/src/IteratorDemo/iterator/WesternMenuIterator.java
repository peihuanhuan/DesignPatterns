package IteratorDemo;

import java.util.ArrayList;
import java.util.List;

public class WesternMenuIterator implements Iterator {

    private List<String> menuItems;

    private int index;

    public WesternMenuIterator(List<String> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (index < menuItems.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return menuItems.get(index++);
        } else {
            return new Exception("没有下一个");
        }
    }
}
