package com.ql.mvc.service;

import java.util.List;

import com.ql.mvc.pojo.User;

public interface IUserService {
	public User getUserById(int userId);
	public int insterUser(User user);
	public void updateUser(User user);
	public User queryOfId(int id);
	public List<User> queryOfAccountAndPw(User user);
}
