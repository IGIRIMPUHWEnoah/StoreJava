package kabagambe.demo.controllers;

import kabagambe.demo.entities.User;
import kabagambe.demo.repositories.userRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final userRepository userRepository;

    public UserController(userRepository userRepository) {
        this.userRepository = userRepository;
    }


    @RequestMapping("/users")
    public Iterable<User> getUser(){

      return   userRepository.findAll();
    }

    @RequestMapping("/users/{id}")

    public  User getUserById(@PathVariable Long id){

        return userRepository.findById(id).orElse(null);

    }
}
