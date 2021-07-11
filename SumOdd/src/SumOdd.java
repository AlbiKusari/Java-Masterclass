public class SumOdd {

    public static boolean isOdd (int number) {

        if (number <= 0) return false;

        return number % 2 != 0;

    }

    public static int sumOdd (int start , int end) {

        if (start <= 0 || end <= 0) return -1;

        if (start > end) return -1;

        if (!isOdd(start) && !isOdd(end) && start == end) return 0;

        if (isOdd(start) && isOdd(end) && start == end) return start;

        int accumulator = 0;

        for (int i = start; i <= end; i++)
            if (isOdd(i))
                accumulator+= i;

        return accumulator;

    }

}
