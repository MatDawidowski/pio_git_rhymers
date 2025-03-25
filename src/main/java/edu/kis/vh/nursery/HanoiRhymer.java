package edu.kis.vh.nursery;

/**
 * HanoiRhymer to klasa, która dziedziczy po DefaultCountingOutRhymer.
 * Implementuje specjalne zasady dodawania elementów do stosu,
 * gdzie elementy większe od obecnego wierzchołka są odrzucane. 
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     * Metoda zwracająca liczbę odrzuconych elementów.
     * 
     * @return totalRejected - liczba odrzuconych elementów
     */
    public int reportRejected() {
        return totalRejected;
    }
    /**
     * Dodaje element do stosu, jeśli jest mniejszy lub równy obecnemu wierzchołkowi stosu.
     * Jeśli jest większy, zwiększa licznik odrzuconych elementów.
     *
     * @param in - wartość elementu do dodania
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
