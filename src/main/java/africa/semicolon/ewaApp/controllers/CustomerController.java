package africa.semicolon.ewaApp.controllers;

import africa.semicolon.ewaApp.data.models.Customer;
import africa.semicolon.ewaApp.dtos.requests.RegisterCustomerRequest;
import africa.semicolon.ewaApp.dtos.responses.RegisterCustomerResponse;
import africa.semicolon.ewaApp.services.CustomerService;
import africa.semicolon.ewaApp.services.CustomerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    @PostMapping("/api/v1/register")
    public RegisterCustomerResponse registerCustomer(@RequestBody RegisterCustomerRequest registerCustomerRequest) {
        return customerService.registerCustomer(registerCustomerRequest);
    }
    @GetMapping("/api/v1/register/{email}")
    public Optional<Customer> getCustomerEmail(String email) {return customerService.findCustomerByEmail(email);}
}
