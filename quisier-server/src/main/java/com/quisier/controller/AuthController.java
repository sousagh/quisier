package com.quisier.controller;

import com.mongodb.DuplicateKeyException;
import com.quisier.domain.QuisierResponse;
import com.quisier.domain.User;
import com.quisier.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gustavosousa on 4/2/17.
 */
@RestController
@CrossOrigin
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @RequestMapping("/signup")
    public QuisierResponse signup(@RequestBody User user){

        QuisierResponse quisierResponse = new QuisierResponse();

        try {

             user = userService.save(user);
             quisierResponse.setData(user);
             quisierResponse.setSuccess(true);
        } catch (DuplicateKeyException du){
            quisierResponse.setMessage("Duplicated email.");
            quisierResponse.setSuccess(false);
        } catch (Exception e){
            quisierResponse.setMessage(e.getMessage());
            quisierResponse.setSuccess(false);
        }

        return quisierResponse;
    }

    @RequestMapping("/login")
    public QuisierResponse login(@RequestBody User user){

        QuisierResponse quisierResponse = new QuisierResponse();

        try{

            String token = userService.login(user.getEmail(), user.getPassword());
            quisierResponse.setSuccess(true);
            quisierResponse.setData(token);

        } catch (Exception e){
            quisierResponse.setMessage(e.getMessage());
            quisierResponse.setSuccess(false);
        }

        return quisierResponse;
    }

}
