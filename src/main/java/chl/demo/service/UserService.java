package chl.demo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import chl.demo.dao.UserMapper;
import chl.demo.model.User;


@Service
public class UserService {
	
	@Inject
	private UserMapper userMapper;
	
	/**
	 * 获取所有用户
	 */
	public List<User> getAllUsers(){
		return userMapper.getAllUsers();
	}
	
	/**
	 * 登录
	 */
	public List<User> login(User user){
		return userMapper.login(user);
	}

}
