package africa.semicolon.ewaApp.data.repositories;

import africa.semicolon.ewaApp.data.models.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {

    Customer save(Customer customer);

    Optional<Customer> findCustomerByEmail(String email);

    void delete(Customer customer);

    void deleteByEmail(String email);

    List<Customer> findAll();

}
