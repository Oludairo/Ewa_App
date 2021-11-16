package africa.semicolon.ewaApp.data.models;

import lombok.Data;

@Data
public class Customer {
    private String firstName;
    private String lastName;
    private String customerEmail;
    private String customerPassword;
}
