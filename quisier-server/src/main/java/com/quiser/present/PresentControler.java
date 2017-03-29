package com.quiser.present;

import com.quiser.business.UserInfo;
import com.quiser.storage.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yf_zh on 3/28/2017.
 */
@RestController
public class PresentControler {
    @Autowired
    private UserRepository repository;

//    @GetMapping("/application")
//    public String applicationForm(Model model) {
//        model.addAttribute("userInfo", new UserInfo());
//        return "userInfo";
//    }
    @PostMapping("/application")
    public UserInfo applicationSubmit(@RequestBody UserInfo userInfo) {
        repository.save(userInfo);
        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (UserInfo userInfoshow : repository.findAll()) {
            System.out.println(userInfoshow);
        }
        return userInfo;
    }




}
