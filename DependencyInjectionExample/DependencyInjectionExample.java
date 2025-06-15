public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Create the repository (dependency)
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject dependency into service via constructor
        CustomerService service = new CustomerService(repository);

        // Use the service
        service.displayCustomer("C101");
        service.displayCustomer("C105"); // Not in DB
    }
}
