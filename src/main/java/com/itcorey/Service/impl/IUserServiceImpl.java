package com.itcorey.Service.impl;

import com.itcorey.Service.IUserService;
import com.itcorey.dao.IUserDao;
import com.itcorey.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ：Corey
 * 20:55 2018/11/5
 */
@Service("userService")
public class IUserServiceImpl implements IUserService {

    @Resource
    private IUserDao iUserDao;

    @Override
    public User getUserById(int userId) {
        return iUserDao.selectByPrimaryKey(userId);
    }

    @Override
    public int insterUser(User user) {
     return iUserDao.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return iUserDao.updateByPrimaryKey(user);
    }

    @Override
    public int delUser(int userId) {
        return iUserDao.deleteByPrimaryKey(userId);
    }
}
