package com.dev.zj.app.business.dao;

import com.dev.zj.app.business.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
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

    @Insert("insert into t_user(name,age,nickname) values(#{name},#{age},#{nickname})")
    boolean insert(User a);

    @Delete("delete from t_user2 where id = #{id}")
    boolean deleteById(Long id);
}
