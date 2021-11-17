package africa.semicolon.ewaApp.services;

import africa.semicolon.ewaApp.data.models.Customer;
import africa.semicolon.ewaApp.data.repositories.CustomerRepository;
import africa.semicolon.ewaApp.data.repositories.CustomerRepositoryImpl;
import africa.semicolon.ewaApp.dtos.requests.RegisterCustomerRequest;
import africa.semicolon.ewaApp.dtos.responses.RegisterCustomerResponse;
import africa.semicolon.ewaApp.exceptions.DuplicateCustomerException;
import africa.semicolon.ewaApp.utils.ModelMapper;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService{
    static final CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public RegisterCustomerResponse registerCustomer(RegisterCustomerRequest registerCustomerRequest) throws DuplicateCustomerException {
        Optional<Customer> customerInDB = customerRepository.findCustomerByEmail(registerCustomerRequest.getCustomerEmail());
        if (customerInDB.isPresent()) throw new DuplicateCustomerException(registerCustomerRequest.getCustomerEmail() + "already exists");
        Customer customer = ModelMapper.map(registerCustomerRequest);
        Customer savedCustomer = customerRepository.save(customer);
        return ModelMapper.map(savedCustomer);
    }

    @Override
    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteAllCustomer() {
    }

    @Override
    public Optional<Customer> findCustomerByEmail(String email) {
        return customerRepository.findCustomerByEmail(email);
    }
}
