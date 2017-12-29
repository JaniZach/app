package com.dev.zj.business.dao;

import com.dev.zj.business.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author P50
 * @date 2017/12/28 22:36
 */
@Mapper
public interface UserDAO {

    @Select("select * from t_user where id = #{id}")
    User getById(Long id);
}
