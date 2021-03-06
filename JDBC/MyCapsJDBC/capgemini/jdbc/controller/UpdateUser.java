package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UpdateUser {
	public static void main(String[] args) {
		UserServices services=UserFactory.instanceOfUserServicesImpl();
		UserBean user=new UserBean();
		Scanner sc=new Scanner(System.in);

		System.out.println("enter userid....");
		user.setUserid(Integer.parseInt(sc.nextLine()));
		
		System.out.println("enter the password... ");
		user.setPassword(sc.nextLine());
		

		if(services.updateUser(user.getUserid(), user.getPassword())) {
			System.out.println("User Updated..");
		}
		else {
			System.err.println("Something went wrong..");
		}
		
	}
}
