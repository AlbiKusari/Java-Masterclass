public class EvenDigitSum {

    public static int getEvenDigitSum (int number) {

        if (number < 0) return -1;

        int accumulator = 0;


        while (number > 0) {

            int even = number % 10;
            if (even % 2 == 0)
            accumulator+= even;

            number/= 10;

        }

        return accumulator;

    }

}
