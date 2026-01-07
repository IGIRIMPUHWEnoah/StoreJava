package kabagambe.demo.controllers;

import kabagambe.demo.entities.User;
import kabagambe.demo.repositories.userRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final userRepository userRepository;

    public UserController(userRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUser(){

        userRepository
    }
}
