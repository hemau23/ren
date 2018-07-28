package com.revnomix.revseed.service;

import com.revnomix.revseed.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
