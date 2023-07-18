package com.fundamentos.springboot.fundamentos.service;

import com.fundamentos.springboot.fundamentos.entity.User;
import com.fundamentos.springboot.fundamentos.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service
public class UserService {
    private final UserRepo userRepository;

    public UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(String name, String email, LocalDate birthDay) {
        User user = new User(name, email, birthDay);
        user.setName(name);
        user.setEmail(email);
        user.setBirthDay(birthDay);

        userRepository.save(user);
    }
}
