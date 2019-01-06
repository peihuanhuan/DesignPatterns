package IteratorDemo.iterator;

public class ChineseMenuIterator implements Iterator {

    private String[] menuItems;

    private int index;

    public ChineseMenuIterator(String[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (index > menuItems.length-1 || menuItems[index] ==null) {
            return false;
        } else {
            return false;
        }
    }


    @Override
    public Object next() {
        if (hasNext()) {
            return menuItems[index++];
        }
        return new Exception("没有下一项");
    }
}
