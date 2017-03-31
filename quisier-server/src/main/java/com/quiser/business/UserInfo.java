package com.quiser.business;
import org.springframework.data.annotation.Id;
import lombok.Getter;

public class UserInfo {
    @Id
    private String id;
    @Getter
    private String firstName;
    @Getter
    private String lastName;
    @Getter
    private String email;
    @Getter
    private String password;
    @Getter
    private UserType userType;
    private UserInfo() {

    }
    public UserInfo(String firstName, String lastName, String email, String password, UserType userType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }
    @Override
    public String toString() {
        return String.format(
                "User [id=%s, Name='%s', e-mail='%s', password='%s']",
                id, firstName + lastName, email, password);
    }
}
