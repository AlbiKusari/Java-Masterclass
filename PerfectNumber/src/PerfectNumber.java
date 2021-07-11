public class PerfectNumber {

    public static boolean isPerfectNumber (int number) {


        if (number < 1) return false;

        int accumulator = 0;
        for (int i = 1; i <= number / 2; i++)
            if (number % i == 0)
                accumulator+= i;

        return accumulator == number;


    }

}
