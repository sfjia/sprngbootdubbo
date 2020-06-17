package com.springbootdubbo.dubbodemo.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author ：jiasanfeng
 * @date ：Created in 2020-06-17 10:23
 */
@Data
public class UserDO {

    private Long id;
    /** 姓名 */
    private String name;
    /** 电话号码 */
    private String phone;
    /** 邮箱 */
    private String mail;
    /** 用户类型 */
    private String type;
    private String typeStr;
    /** 内部员工id*/
    private String innerUserId;
    /** 钉钉用户id */
    private String ddUserId;
    /** 创建时间 */
    private Date dateCreate;
    /** 修改时间 */
    private Date dateUpdate;
    /** 删除标识 */
    private long deleted;
}
