
package com.weibo.dashboard.service.impl;

import java.util.List;

import com.weibo.dashboard.entity.User;

public interface UserService {
	User select(String name);
	List<User>selectUserList();
	int userNameExits(String name);
	boolean accountValid(User user);
	int insert(User user);
}

