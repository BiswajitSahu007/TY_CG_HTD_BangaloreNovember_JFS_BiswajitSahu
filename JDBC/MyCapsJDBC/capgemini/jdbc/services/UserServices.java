package com.capgemini.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;

public interface UserServices {
	public List<UserBean> getAllUsers();
	public UserBean userLogin(String username,String password);
	//update
	public boolean updateUser(int userid,String password);
	//delete
	public boolean deleteUser(int userid,String password);
	//insert
	public boolean insertUser(UserBean user);
}
