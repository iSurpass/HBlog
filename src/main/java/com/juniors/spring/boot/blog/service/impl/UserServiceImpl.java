package com.juniors.spring.boot.blog.service.impl;

import com.juniors.spring.boot.blog.domin.User;
import com.juniors.spring.boot.blog.repository.UserRepository;
import com.juniors.spring.boot.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Juniors
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public User saveOrUpdateUser(User user) {

        return userRepository.save(user);
    }

    @Override
    @Transactional
    public User registerUser(User user) {

        return userRepository.save(user);
    }

    @Override
    @Transactional
    public void removeUser(Long id) {

        userRepository.delete(id);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public Page<User> listUserByNameLike(String name, Pageable pageable) {

        name = "%" + name + "%";
        Page<User> users = userRepository.findByNameLike(name,pageable);
        return users;
    }
}
