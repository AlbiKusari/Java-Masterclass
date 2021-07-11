public class DigitSumChallenge {

    public static int sumDigits (int number) {

        if (number < 10) return -1;

        int accumulator = 0;


       while (number > 0) {

           accumulator+= (number % 10);
           number/= 10;

       }

        return accumulator;

    }

}
