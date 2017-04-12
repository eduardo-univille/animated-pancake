package estd;

import java.util.Iterator;

public class DLinkedListIterator<T> implements Iterator<T> {
    DNode<T> current;

    public DLinkedListIterator(DNode<T> current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T value = current.getValue();
        current = current.getNext();
        return value;
    }
}
