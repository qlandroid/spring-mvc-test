package com.ql.mvc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ql.mvc.dao.MyUserDao;
import com.ql.mvc.pojo.User;
import com.ql.mvc.service.IUserService;


@Service("userService")
public class UserService implements IUserService {
	
	@Resource
	private MyUserDao userDao;
		
	public User getUserById(int userId) {
		return null;
	}

	@Override
	public int insterUser(User user) {
		return userDao.addUserOfAccountAndPw(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		//userDao.updateUSer(user);
		
	}

	@Override
	public User queryOfId(int id) {
		
		return null;
	}

	@Override
	public List<User> queryOfAccountAndPw(User user) {
		
		return userDao.queryUser(user);
	}
}
