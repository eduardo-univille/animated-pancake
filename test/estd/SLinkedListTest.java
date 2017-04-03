package estd;

import org.junit.Assert;
import org.junit.Test;

public class SLinkedListTest {
    @Test
    public void getSizeTest() {
        SLinkedList<String> linkedList = new SLinkedList<>();

        Assert.assertEquals(0, linkedList.getSize());

        linkedList.add("A");
        Assert.assertEquals(1, linkedList.getSize());

        linkedList.add("B");
        Assert.assertEquals(2, linkedList.getSize());

        linkedList.add("C");
        Assert.assertEquals(3, linkedList.getSize());
    }
}
