package com.itcorey.dao;

import com.itcorey.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ：Corey
 * 20:54 2018/11/5
 * Dao接口
 */
@Repository
public interface IUserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getAllUser();
}
