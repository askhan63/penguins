package penguins;

public final class Solution {

    private Solution() {
    }

    /**
     * Calculate the nth value of PenguTwinSequenceF.
     *
     * @param n the element to calculate
     * @return the result of the calculation
     * @throws IllegalArgumentException when n is negative
     */
    public static int penguTwinSeqF(int n) throws IllegalArgumentException {
        // TODO 1.1: Implement penguTwinSeqF
        if (n < 0) {
        throw new IllegalArgumentException();
    }
    if (n == 0) {
        return 1;
    }
    return n - penguTwinSeqM(penguTwinSeqF(n-1));
      
    }

    /**
     * Calculate the nth value of PenguTwinSequenceM.
     *
     * @param n the element to calculate
     * @return the result of the calculation
     */
    public static int penguTwinSeqM(int n) throws IllegalArgumentException {
        // TODO 1.1: Implement penguTwinSeqM
         if (n < 0) {
        throw new IllegalArgumentException();
    }
    if (n == 0) {
        return 0;
    }
    return n - penguTwinSeqF(penguTwinSeqM(n-1));
    }

    /**
     * Calculate the result of PenguBigSeq.
     *
     * @param n the value of n
     * @param a the value of a
     * @return the result of the calculation
     */
    public static long penguBigSeq(long n, long a) throws IllegalArgumentException {
        // TODO 1.2: Implement penguBigSeq
            if (n < 0) {
        throw new IllegalArgumentException();
    }
    if (n == 0) {
        return 1;
    }
    return (a*a*a) * penguBigSeq(n-1, a)*penguBigSeq(n-1, a);
    }

    /**
     * Calculate the nth value of PenguRecursiveSequence.
     *
     * @param n  the element to calculate
     * @param p0 the value of p0
     * @param p1 the value of p1
     * @param p2 the value of p2
     * @return the result of the calculation
     */
    public static long penguRecursiveSeq( long n, long p0, long p1, long p2 ) {
        // TODO 1.3: Implement penguRecursiveSeq
         if (n < 0) {
        return 2 * penguRecursiveSeq(-n, p0, p1, p2);
    }
    if (n < 3) {
        switch((int)n) {
            case 0:
                return p0;
            case 1:
                return p1;
            case 2:
                return p2;
            default:
                System.out.println("Something to do.");
                
        }
    }
    return penguRecursiveSeq(n-1, p0, p1, p2) - penguRecursiveSeq(n-2, p0, p1, p2) + 2 * penguRecursiveSeq(n-3, p0, p1, p2);
    }
}
