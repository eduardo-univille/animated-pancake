package estd;

import java.util.Iterator;

public class SLinkedList<T> implements Iterable<T> {
    private Node<T> first;
    private Node<T> last;
    private long size = 0;

    public T getFirst() {
        return first.getValue();
    }

    public T getLast() {
        return last.getValue();
    }

    public long getSize() {
        return size;
    }

    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            first = first.getNext();
            size--;
            if (isEmpty()) {
                last = null;
            }
        }
    }

    public Iterator<T> iterator() {
        return new SLinkedListIterator<T>(first);
    }
}
