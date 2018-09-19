package test.t01.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import test.t01.entity.User;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select * from new_table")
    List<User> getInfo();
}
