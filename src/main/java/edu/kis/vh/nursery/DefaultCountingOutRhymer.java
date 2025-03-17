package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_COUNT = 12;
    public static final int ERROR_RETURN = -1;
    public static final int FULL_SIZE = 11;

    private final int[] numbers = new int[NUMBERS_COUNT];

    public int total = ERROR_RETURN;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR_RETURN;
    }

    public boolean isFull() {
        return total == FULL_SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_RETURN;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_RETURN;
        return numbers[total--];
    }

}
