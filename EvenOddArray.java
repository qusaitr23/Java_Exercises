import java.util.*;
public class EvenOddArray {
    /** Sort EVEN_ODD BY LIST
     *
     * @param **return list
     */

    public static void main(String[] args) {

        List < Integer > odd = new ArrayList < Integer > ();

        List < Integer > even = new ArrayList < Integer > ();

        int a [] = {7,8,4,9,7,3,6,9,10};

        int i;
        for (i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {

                even.add(a[i]);

            } else {

                odd.add(a[i]);

            }
        }
        even.addAll(odd);
        System.out.print("Even: " + even);
    }
}

