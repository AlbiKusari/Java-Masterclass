import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList <Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        transactions = new ArrayList<Double>();
        transactions.add(initialAmount);

    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount){

        transactions.add(amount);

    }

}
