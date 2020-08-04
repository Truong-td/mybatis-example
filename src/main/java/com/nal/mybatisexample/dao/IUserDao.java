package com.nal.mybatisexample.dao;

import com.nal.mybatisexample.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IUserDao {
    // get all student
    final String GET_ALL_USER = "SELECT * FROM USER";

    @Select(GET_ALL_USER)
    @Results(value = { @Result(property = "id", column = "ID"),
            @Result(property = "username", column = "username"),
            @Result(property = "password", column = "password")})
    public List<User> getAll();

}
