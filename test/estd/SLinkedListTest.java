package estd;

import org.junit.Assert;
import org.junit.Test;

public class SLinkedListTest {
    @Test
    public void printTest() {
        SLinkedList<String> linkedList = new SLinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        for (String e : linkedList) {
            System.out.println(e);
        }
    }

    @Test
    public void getSizeTest() {
        SLinkedList<String> linkedList = new SLinkedList<>();

        Assert.assertEquals(0, linkedList.getSize());

        linkedList.add("A");
        Assert.assertEquals(1, linkedList.getSize());
        Assert.assertEquals("A", linkedList.getFirst());
        Assert.assertEquals("A", linkedList.getLast());

        linkedList.add("B");
        Assert.assertEquals(2, linkedList.getSize());
        Assert.assertEquals("A", linkedList.getFirst());
        Assert.assertEquals("B", linkedList.getLast());

        linkedList.add("C");
        Assert.assertEquals(3, linkedList.getSize());
        Assert.assertEquals("A", linkedList.getFirst());
        Assert.assertEquals("C", linkedList.getLast());
    }

    @Test
    public void removeFirstTest() {
        SLinkedList<String> linkedList = new SLinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        Assert.assertEquals(3, linkedList.getSize());
        Assert.assertEquals("A", linkedList.getFirst());
        Assert.assertEquals("C", linkedList.getLast());

        linkedList.removeFirst();
        Assert.assertEquals(2, linkedList.getSize());
        Assert.assertEquals("B", linkedList.getFirst());
        Assert.assertEquals("C", linkedList.getLast());

        linkedList.removeFirst();
        Assert.assertEquals(1, linkedList.getSize());
        Assert.assertEquals("C", linkedList.getFirst());
        Assert.assertEquals("C", linkedList.getLast());

        linkedList.removeFirst();
        Assert.assertEquals(0, linkedList.getSize());
    }
}
