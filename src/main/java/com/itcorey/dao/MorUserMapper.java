package com.itcorey.dao;


import com.itcorey.domain.MorUser;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MorUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MorUser record);

    int insertSelective(MorUser record);

    MorUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MorUser record);

    int updateByPrimaryKey(MorUser record);

    List<MorUser> getAllUser();
}