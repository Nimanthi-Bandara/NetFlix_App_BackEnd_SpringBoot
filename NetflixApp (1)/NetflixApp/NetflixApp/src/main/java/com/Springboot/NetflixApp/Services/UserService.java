package com.Springboot.NetflixApp.Services;

import com.Springboot.NetflixApp.Entity.User;

import java.util.List;

    public interface UserService {
        User createUser(User user);
        List<User> getAllUsers();
        void deleteUser(Long userId);

        void deleteAllUser();

        void updateName(String email,User user);

    }