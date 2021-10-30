public class FizzBazz {
    /**
     * FIZZBUZZ - method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
     * For numbers which are multiples of both three and five return 'FizzBuzz'.
     * For numbers that are neither, return the input number.
     * @param i
     */
    public static void FizzBazz_F(int i) {
        if (i % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
    FizzBazz_F(6555);

    }
}



