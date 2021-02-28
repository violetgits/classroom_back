package com.jwd.classroom.mapper;

import com.jwd.classroom.pojo.CrUser;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2021-02-28 12:24
 * <p>
 *
 * @author author
 */
public interface CrUserMapper {
    int deleteByPrimaryKey(String openid);

    int insert(CrUser record);

    int insertSelective(CrUser record);

    CrUser selectByPrimaryKey(String openid);

    int updateByPrimaryKeySelective(CrUser record);

    int updateByPrimaryKey(CrUser record);
}