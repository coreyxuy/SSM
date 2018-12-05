package com.itcorey.dao;


import com.itcorey.model.XyTotaldebt;
import org.springframework.stereotype.Repository;

@Repository
public interface XyTotaldebtMapper {
    int deleteByPrimaryKey(Long id);

    int insert(XyTotaldebt record);

    int insertSelective(XyTotaldebt record);

    XyTotaldebt selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(XyTotaldebt record);

    int updateByPrimaryKey(XyTotaldebt record);
}