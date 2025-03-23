package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY_RHYMER = -1;
    private Node last;
    private int i;

    public void push(int value) {
        if (last == null)
            last = new Node(value);
        else {
            last.setNext(new Node(value));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_RHYMER;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_RHYMER;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
