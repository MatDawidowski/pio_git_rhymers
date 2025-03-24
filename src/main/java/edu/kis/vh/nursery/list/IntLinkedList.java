package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY_RHYMER = -1;
    private Node last;

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
class Node {

    private final int value;
    private Node prev;
	private Node next;

    public Node(int i) {
        value = i;
    }

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public int getValue() {
		return value;
	}

}

