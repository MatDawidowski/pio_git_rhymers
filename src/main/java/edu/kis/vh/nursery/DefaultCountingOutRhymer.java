package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_COUNT = 12;
    public static final int INITIAL_RHYMER = -1;
    public static final int EMPTY_RHYMER = -1;

    private final int[] numbers = new int[NUMBERS_COUNT];

    public int total = INITIAL_RHYMER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL_RHYMER;
    }

    public boolean isFull() {
        return total == NUMBERS_COUNT -1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_RHYMER;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_RHYMER;
        return numbers[total--];
    }

}
