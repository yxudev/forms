package com.yishan.forms.service;

import com.yishan.forms.domain.User;
import com.yishan.forms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }



    public UserService() {
    }

    @Transactional
    public User createNewUser(User newUser) {
        save(newUser);
        return newUser;
    }

    public User findById(Long Id) {

        return userRepository.findById(Id).get();
    }
}
