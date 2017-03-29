package com.quiser.business;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.data.annotation.Id;
/**
 * Created by yf_zh on 3/28/2017.
 */

public class UserInfo {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private UserType userType;
    private UserInfo() {

    }
    public UserInfo(String firstName, String lastName, String eMail, String password ,UserType userType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = eMail;
        this.password = password;
        this.userType = userType;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return String.format(
                "User [id=%s, Name='%s', e-mail='%s', password='%s']",
                id, firstName + lastName, email, password);
    }
}
