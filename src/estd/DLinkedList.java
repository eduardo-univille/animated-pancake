package estd;

import java.util.Iterator;

public class DLinkedList<T> implements Iterable<T> {
    private DNode<T> first;
    private DNode<T> last;
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

    public void addLast(T value) {
        DNode<T> node = new DNode<>(value);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            node.setPrev(last);
            last.setNext(node);
            last = node;
        }
        size++;
    }

    public void addFirst(T value) {
        DNode<T> node = new DNode<>(value);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            first.setPrev(node);
            node.setNext(first);
            first = node;
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
        return new DLinkedListIterator<T>(first);
    }
}
