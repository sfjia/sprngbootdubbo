package com.springbootdubbo.dubbodemo.service;

import com.springbootdubbo.dubbodemo.domain.UserDO;

/**
 *
 */

public interface UserService {

    UserDO findById(Long id);
}
