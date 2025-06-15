import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customerDatabase = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Sample data
        customerDatabase.put("C101", new Customer("C101", "Alice"));
        customerDatabase.put("C102", new Customer("C102", "Bob"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerDatabase.get(id);
    }
}
