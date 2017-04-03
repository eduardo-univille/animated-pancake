package estd;

public class Node<T> {
    private Node<T> next;
    private T value;

    public Node(T value) {
        setValue(value);
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    private void setValue(T value) {
        this.value = value;
    }
}
