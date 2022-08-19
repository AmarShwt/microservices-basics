package com.user.user_service.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.user_service.entity.User;
import com.user.user_service.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	
	List<User> user= List.of(
			new User(1L,"Amar","1234123412"),
			new User(2L,"Sam","987655"),
			new User(3L,"Test","98765235")
			);
	
	
	@Override
	public User getUser(Long userId) {
		return user.stream().filter(user->user.getUserId().equals(userId)).findAny().orElse(null);
	}

}
