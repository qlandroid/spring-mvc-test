package com.ql.mvc.dao;

import java.util.List;

import com.ql.mvc.pojo.User;

public interface MyUserDao {
  
	int addUserOfAccountAndPw(User user);
	List<User> queryUser(User user);
  
    
}