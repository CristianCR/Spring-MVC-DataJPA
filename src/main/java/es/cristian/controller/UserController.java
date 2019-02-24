package es.cristian.controller;

import es.cristian.model.User;
import es.cristian.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value="/getAllUsers")
    public List<User> getAllUsers(){
        User user = new User();
        user.setName("X");
        user.setSubname("X");
        user.setMail("X");
        user.setPhone("X");
        user.setUsername("X");
        user.setPassword("X");
        user.setPortal(1);
        user.setLetter("X");
        user.setFloor(1);
        userService.save(user);
        return userService.findAll();
    }
}
