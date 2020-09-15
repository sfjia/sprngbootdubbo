package com.springbootdubbo.dubbodemo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springbootdubbo.dubbodemo.domain.UserDO;
import com.springbootdubbo.dubbodemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：jiasanfeng
 * @date ：Created in 2020-06-17 10:18
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Reference()
    private CustomerSearchAPI customerSearchAPI;

    @RequestMapping("getUser/{id}")
    public UserDO findById(@PathVariable Long id){
        log.info("restful id[{}]",id);
        UserDO user = userService.findById(id);
        log.info("User.toString:{}",user.toString());
        return user;
    }

    @RequestMapping("getUser")
    public UserDO getUserById(@RequestParam("id") Long id){
        log.info("api id[{}]",id);
        UserDO user = userService.findById(id);
        log.info("User.toString:{}",user.toString());
        return user;
    }

    @RequestMapping("getSearch")
    public CallResult getSerch(@RequestParam("claimType")String claimtype){
        log.info("claimType:[{}]",claimtype);
        CustomerSearchParam param = new CustomerSearchParam();
        param.setClaimType(claimtype);
        CallResult<Page<CustomerSearchDTO>> pageCallResult = customerSearchAPI.queryCustomerList(param);
        return pageCallResult;
    }
}
