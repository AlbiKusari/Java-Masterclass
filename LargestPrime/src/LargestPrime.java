public class LargestPrime {

    public static int getLargestPrime (int number) {

        if (number <= 1) return -1;

        int prime = 0;

        for (int i = 2; i <= number/2; i++)
            if (number % i == 0){

                if (i % 2 != 0 && i % 3 != 0)
                    prime = i;

                if (prime <= 3) {

                if (i % 3 == 0)
                        prime = 3;

                else prime = 2;

                }

            }


        if (prime == 0)
            return number;

        return prime;
    }

}
