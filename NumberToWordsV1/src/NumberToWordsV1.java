public class NumberToWordsV1 {

    public static String NumberToWord (int number) {

        if (number < 0)
            number*= -1;


        switch (number % 10){

            case 0:
               return "Zero";


            case 1:
               return "One";


            case 2:
              return "Two";


            case 3:
              return "Three";


            case 4:
              return "Four";


            case 5:
              return "Five";


            case 6:
              return "Six";


            case 7:
              return "Seven";


            case 8:
              return "Eight";


            case 9:
              return "Nine";


            default:
              return "Invalid Value";
         }
    }

    public static void Number (int number) {

        if (number == 0)
            System.out.println(NumberToWord(0));

        else {

            if (number < 0) {
                number *= -1;
                System.out.print("Negative ");
            }
            int accumulator = 0;
            int r = 0;

            while (number % 10 == 0) {
                r += 1;
                number /= 10;
            }


            while (number > 9) {

                accumulator += number % 10;
                number /= 10;
                accumulator *= 10;

            }

            accumulator += number % 10;

            while (accumulator > 9) {
                System.out.print(NumberToWord(accumulator % 10) + ", ");
                accumulator /= 10;
            }
            if (r == 0)
                System.out.print(NumberToWord(accumulator % 10));
            else System.out.print(NumberToWord(accumulator % 10) + ", ");


            while (r > 0) {
                if (r == 1)
                    System.out.println(NumberToWord(0));
                else System.out.print(NumberToWord(0) + ", ");
                r--;
            }


        }
    }
}