import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"Ahmet","Muhsin"));
        customers.add(new Customer(2,"Mehmet","Kaya"));
        customers.add(new Customer(3,"Aziz","Dere"));

        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}