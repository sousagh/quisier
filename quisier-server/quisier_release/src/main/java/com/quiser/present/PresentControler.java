package com.quiser.present;

import com.quiser.business.UserInfo;
import com.quiser.storage.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by yf_zh on 3/28/2017.
 */
@RestController
public class PresentControler {
    @Autowired
    private WrapRP repository;


    @PostMapping("/application")
    public Response applicationSubmit(@RequestBody UserInfo userInfo) {

            return getResult(repository,userInfo);

    }
    public static Response getResult(WrapRP wrapRP, UserInfo userInfo) {
        String email = userInfo.getEmail();
        Optional<UserInfo> result = Optional.ofNullable(wrapRP.findByEmail(email));
        if(result.isPresent()) {
            Response response = new FalseResponse(false,
                    "User with email sousagh@gmail.com already exists");
            return response;
        }
        wrapRP.save(userInfo);
        Response response = new TrueResponse(true, userInfo);
        return response;
    }



}
