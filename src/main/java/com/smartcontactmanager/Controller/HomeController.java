package com.smartcontactmanager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartcontactmanager.dao.UserRepository;
import com.smartcontactmanager.entities.User;

@Controller
public class HomeController {

    @Autowired
    public UserRepository userRepository;

    @GetMapping("/test")
    @ResponseBody
    public String test() {

        User user = new User();
        user.setName("Kumar Ankit");
        user.setEmail("kumarankit@gmail.com");
        userRepository.save(user);
        return "Working";
    }
}
