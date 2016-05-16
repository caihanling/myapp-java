package chl.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import chl.demo.model.User;

public interface UserMapper {
	
	
	@Select("select * from user")
	public List<User> getAllUsers();
	
	
	@Select("select * from user where username = #{username} and password = #{password}")
	public List<User> login(User user);

}
