package com.itcorey.Service.impl;

import com.itcorey.Service.IUserService;
import com.itcorey.dao.IUserDao;
import com.itcorey.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

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

    @Transactional
    public int insterUser(User user) {
     return iUserDao.insert(user);
    }

    @Transactional
    public int updateUser(User user) {
        return iUserDao.updateByPrimaryKey(user);
    }

    @Transactional
    public int delUser(int userId) {
        return iUserDao.deleteByPrimaryKey(userId);
    }

    @Override
    public List<User> getAllUser() {
        return iUserDao.getAllUser();
    }
}
