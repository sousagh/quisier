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
//    private String email;
//    private String password;
    @Getter
    private LoginInfo loginInfo;
    @Getter
    private UserType userType;
    private UserInfo() {

    }
    public UserInfo(String firstName, String lastName, LoginInfo loginInfo ,UserType userType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.loginInfo = loginInfo;
        this.userType = userType;
    }

    @Override
    public String toString() {
        return String.format(
                "User [id=%s, Name='%s', e-mail='%s', password='%s']",
                id, firstName + lastName, loginInfo.getEmail(), loginInfo.getPassword());
    }
}
