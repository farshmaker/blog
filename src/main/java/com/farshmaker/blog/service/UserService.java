package com.farshmaker.blog.service;

import com.farshmaker.blog.domain.User;

/**
 * @author e.karachun
 * @version 24.11.2017
 */
public interface UserService extends AbstractDomainObjectService<User> {

    /**
     * Getting user by email
     *
     * @param email user's email
     *
     * @return user or <code>null</code>
     */
    User getUserByEmail(String email);
}
