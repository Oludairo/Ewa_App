package africa.semicolon.ewaApp.utils;

import africa.semicolon.ewaApp.data.models.Customer;
import africa.semicolon.ewaApp.dtos.requests.RegisterCustomerRequest;
import africa.semicolon.ewaApp.dtos.responses.RegisterCustomerResponse;

public class ModelMapper {
    public static Customer map(RegisterCustomerRequest registerCustomerRequest){
        Customer customer = new Customer();
        customer.setFirstName(registerCustomerRequest.getFirstName());
        customer.setLastName(registerCustomerRequest.getLastName());
        customer.setCustomerEmail(registerCustomerRequest.getCustomerEmail());
        customer.setCustomerPassword(registerCustomerRequest.getCustomerEmail());

        return customer;
    }

    public static RegisterCustomerResponse map(Customer customer){
        RegisterCustomerResponse response = new RegisterCustomerResponse();
        response.setCustomerEmail(customer.getCustomerEmail());
        return response;
    }

}
