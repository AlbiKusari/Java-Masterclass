public class Main {

    public static void main(String[] args) {

        SimpleCalculator test1 = new SimpleCalculator();

        test1.setFirstNumber(6);
        test1.setSecondNumber(3);

        System.out.println(test1.getFirstNumber());
        System.out.println(test1.getSecondNumber());

        System.out.println(test1.getAdditionResult());
        System.out.println(test1.getSubtractionResult());
        System.out.println(test1.getMultiplicationResult());
        System.out.println(test1.getDivisionResult());

    }

}
