package africa.semicolon.ewaApp.services;

import africa.semicolon.ewaApp.data.models.Customer;
import africa.semicolon.ewaApp.dtos.requests.RegisterCustomerRequest;
import africa.semicolon.ewaApp.dtos.responses.RegisterCustomerResponse;
import africa.semicolon.ewaApp.exceptions.DuplicateCustomerException;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    RegisterCustomerResponse registerCustomer(RegisterCustomerRequest registerCustomerRequest) throws DuplicateCustomerException;

    List<Customer> getCustomer();

    void deleteAllCustomer();

    Optional<Customer> findCustomerByEmail(String email);
}
