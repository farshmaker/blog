package com.farshmaker.blog.service.impl;

import com.farshmaker.blog.domain.User;
import com.farshmaker.blog.service.UserService;

import java.util.Collection;

/**
 * @author e.karachun
 * @version 28.11.2017
 */
public class UserServiceImpl implements UserService {



    @Override
    public User getUserByEmail(String email) {
        return new User();
    }

    @Override
    public User save(User object) {
        return null;
    }

    @Override
    public void remove(User object) {

    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public Collection<User> getAll() {
        return null;
    }
}
