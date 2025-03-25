package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;
import edu.kis.vh.nursery.list.IntLinkedList;
public class TestIntLinkedList {

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertTrue(list.isEmpty());
        list.push(5);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertFalse(list.isFull());
    }

    @Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertEquals(-1, list.top());
        list.push(5);
        Assert.assertEquals(5, list.top());
        list.push(10);
        Assert.assertEquals(10, list.top());
    }
    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertEquals(-1, list.pop());
        list.push(5);
        Assert.assertEquals(5, list.pop());
        Assert.assertTrue(list.isEmpty());
        list.push(10);
        list.push(15);
        Assert.assertEquals(15, list.pop());
        Assert.assertEquals(10, list.pop());
        Assert.assertTrue(list.isEmpty());
    }
}
