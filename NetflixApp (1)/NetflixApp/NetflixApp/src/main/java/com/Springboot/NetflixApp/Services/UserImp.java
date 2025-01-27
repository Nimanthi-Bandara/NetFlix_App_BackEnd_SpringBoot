package com.Springboot.NetflixApp.Services;

import com.Springboot.NetflixApp.Entity.User;
import com.Springboot.NetflixApp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
    public class UserImp implements UserService {

        @Autowired
        private UserRepository userRepository;

        @Autowired
        private JdbcTemplate jdbcTemplate;

        @Override
        public User createUser(User user) {

            return userRepository.save(user);
        }

        @Override
        public List<User> getAllUsers() {

            return userRepository.findAll();
        }

        @Override
        public void deleteUser(Long userId) {

            userRepository.deleteById(userId);
        }

        @Override
        public void deleteAllUser(){

            userRepository.truncateTable();
        }


        @Override
        public void updateName(String email,User user)
        {
            Optional<User> prevUser =  userRepository.findUserByEmail(email);

            if (prevUser.isPresent())
            {
                User newUser = prevUser.get();

                newUser.setName(user.getName());

                userRepository.save(newUser);
            }

        }
    }
