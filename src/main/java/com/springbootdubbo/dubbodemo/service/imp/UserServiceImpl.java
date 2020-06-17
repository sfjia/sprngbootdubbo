package com.springbootdubbo.dubbodemo.service.imp;

import com.springbootdubbo.dubbodemo.Mapper.UserMapper;
import com.springbootdubbo.dubbodemo.domain.UserDO;
import com.springbootdubbo.dubbodemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：jiasanfeng
 * @date ：Created in 2020-06-17 10:19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDO findById(Long id) {
        return userMapper.getUserInfoById(id);
    }
}
