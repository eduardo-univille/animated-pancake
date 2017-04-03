package estd;

public class SLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private long size = 0;

    public long getSize() {
        return size;
    }

    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
        size++;
    }
}
