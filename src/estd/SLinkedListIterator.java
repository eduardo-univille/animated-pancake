package estd;

import java.util.Iterator;

public class SLinkedListIterator<T> implements Iterator<T> {
    Node<T> current;

    public SLinkedListIterator(Node<T> current) {
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
