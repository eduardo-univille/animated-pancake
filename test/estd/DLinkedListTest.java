package estd;

import org.junit.Assert;
import org.junit.Test;

public class DLinkedListTest {
    @Test
    public void printTest() {
        DLinkedList<String> linkedList = new DLinkedList<>();
        linkedList.addLast("A");
        linkedList.addLast("B");
        linkedList.addLast("C");

        for (String e : linkedList) {
            System.out.println(e);
        }
    }

    @Test
    public void addFirstTest() {
        DLinkedList<String> linkedList = new DLinkedList<>();

        Assert.assertEquals(0, linkedList.getSize());

        linkedList.addFirst("A");
        Assert.assertEquals(1, linkedList.getSize());
        Assert.assertEquals("A", linkedList.getFirst());
        Assert.assertEquals("A", linkedList.getLast());

        linkedList.addFirst("B");
        Assert.assertEquals(2, linkedList.getSize());
        Assert.assertEquals("B", linkedList.getFirst());
        Assert.assertEquals("A", linkedList.getLast());

        linkedList.addFirst("C");
        Assert.assertEquals(3, linkedList.getSize());
        Assert.assertEquals("C", linkedList.getFirst());
        Assert.assertEquals("A", linkedList.getLast());
    }

    @Test
    public void addLastTest() {
        DLinkedList<String> linkedList = new DLinkedList<>();

        Assert.assertEquals(0, linkedList.getSize());

        linkedList.addLast("A");
        Assert.assertEquals(1, linkedList.getSize());
        Assert.assertEquals("A", linkedList.getFirst());
        Assert.assertEquals("A", linkedList.getLast());

        linkedList.addLast("B");
        Assert.assertEquals(2, linkedList.getSize());
        Assert.assertEquals("A", linkedList.getFirst());
        Assert.assertEquals("B", linkedList.getLast());

        linkedList.addLast("C");
        Assert.assertEquals(3, linkedList.getSize());
        Assert.assertEquals("A", linkedList.getFirst());
        Assert.assertEquals("C", linkedList.getLast());
    }
}
