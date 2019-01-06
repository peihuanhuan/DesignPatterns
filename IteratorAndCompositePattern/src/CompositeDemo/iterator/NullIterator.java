package CompositeDemo.iterator;

import java.util.Iterator;

/**
 * 空迭代器 hasnext为false
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
