
package com.weibo.dashboard.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.weibo.dashboard.dao.UserMapper;
import com.weibo.dashboard.entity.User;


@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper userMapper;
	
	public User select(String name) {
		return userMapper.select(name);
	}

	public int userNameExits(String name) {
		return userMapper.userNameExits(name);
	}

	public boolean accountValid(User user) {
		return userMapper.accountValid(user)>0;
	}

	public int insert(User user) {
		return userMapper.insert(user);
	}
	public List<User> selectUserList(){
			return userMapper.selectUserList();
		}
}