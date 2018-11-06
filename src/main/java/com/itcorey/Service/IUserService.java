package com.itcorey.Service;

import com.itcorey.model.User;

/**
 * Created by ：Corey
 * 20:54 2018/11/5
 */
public interface IUserService {

    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    User getUserById(int userId);

    /**
     * 添加用户信息
     * @param user
     */
    int insterUser(User user);

    /**
     * 修改用户信息
     * @param user
     */
    int updateUser(User user);

    /**
     * 删除用户信息
     * @param userId
     */
    int delUser(int userId);
}
