package com.vastika.service;

import com.vastika.doa.UserDoa;
import com.vastika.doa.UserDoaImpl;
import com.vastika.model.User;

public class UserServiceImpl implements Userservice{
	UserDoa  userDoa = new UserDoaImpl();
	@Override
	public int saveUserInfo(User user) {
		
		return userDoa.saveUserInfo(user);
	}

}
