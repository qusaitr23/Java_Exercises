public class GCD {
    /**
     * This JAVA program is to find gcd/hcf using Euclidean algorithm using recursion.
     * @param a
     * @param b
     * @return The Greatest Common Divisor of (a,b)
     */

    static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }

    public static void main(String[] args) {
        System.out.println("TEST_______---> gcd is " + gcd(12, 21));
    }
}
