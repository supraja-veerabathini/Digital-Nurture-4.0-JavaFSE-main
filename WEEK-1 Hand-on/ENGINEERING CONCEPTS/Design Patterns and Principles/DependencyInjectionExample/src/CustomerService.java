public class CustomerService {
    private CustomerRepository repo;

    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }

    public void showCustomer(String id) {
        System.out.println(repo.findCustomerById(id));
    }
}
