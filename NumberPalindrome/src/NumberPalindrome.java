public class NumberPalindrome {

    public static boolean isPalindrome (int number) {

        if (number > -10 && number < 10) return true;

        int accumulator = 0;
        int original = number;

        do {

            accumulator*= 10;
            accumulator+= number % 10;
            number/= 10;


        } while (number != 0) ;

        return original == accumulator;

    }

}
