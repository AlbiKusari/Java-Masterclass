public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) return -1;

        if (number < 10) return number * 2;

        int accumulator = number % 10;

        while (number >= 10)
            number /= 10;

        return accumulator + number % 10;
    }
}
