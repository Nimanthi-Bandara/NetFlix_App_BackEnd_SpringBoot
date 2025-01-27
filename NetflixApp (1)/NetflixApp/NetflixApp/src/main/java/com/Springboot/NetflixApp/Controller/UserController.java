package com.Springboot.NetflixApp.Controller;

import com.Springboot.NetflixApp.Entity.User;
import com.Springboot.NetflixApp.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {

        return userService.getAllUsers();
    }

    @PostMapping("/addUser")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId) {

        userService.deleteUser(userId);
    }

    @DeleteMapping("/deleteAllUsers")
    public void deleteAll(){
        userService.deleteAllUser();
    }


    @PutMapping("/updateName/{email}")
    public void UpdateNameByEmail(@PathVariable String email ,@RequestBody User user)
    {
        userService.updateName(email,user);

    }
}
