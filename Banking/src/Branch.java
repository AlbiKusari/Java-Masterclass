import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList <Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer (String customerName , double initialAmount){

        if (findCustomer(customerName) == null){

            customers.add(new Customer(customerName , initialAmount));
            return true;
        }

        return false;

    }

    public boolean addCustomerTransaction(String customerName , double amount){

        Customer existingCustomer = findCustomer(customerName);

        if (findCustomer(customerName) != null){

            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;

    }

    private Customer findCustomer (String customerName) {

        for (int i = 0; i < customers.size(); i++){
            Customer checkedCustomer = customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) // if (customers.get(i).getName().equals(customerName))
                return checkedCustomer;
        }

        return null;
    }

}
