package africa.semicolon.ewaApp.dtos.requests;

import lombok.Data;

@Data
public class RegisterCustomerRequest {
    private String customerEmail;
    private String firstName;
    private String lastName;
    private String password;
}
