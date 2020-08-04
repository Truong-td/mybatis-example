package com.nal.mybatisexample.dao;

import com.nal.mybatisexample.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserDao {
    List<User> getAll();
}
