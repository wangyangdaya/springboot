package com.demo.service;

import com.demo.entity.User;
import com.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangy
 * @contact QQ 837195190
 * @created by thinkpad on 2017/8/29.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUserByName(String name){
        User user = null;
        try {
            user = userRepository.findByUserName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
