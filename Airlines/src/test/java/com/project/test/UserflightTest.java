package com.project.test;

import java.time.LocalDate;

import org.junit.Test;

import com.project.dao.GenericDao;
import com.project.entity.User;

public class UserflightTest {
	
	@Test
	public  void addUser() {
		User u =new User();
		u.setF_name("kavya");
		u.setL_name("ramesh");
		u.setUser_address("Nagercoil");
		//u.setUser_age(2);
		u.setUser_gender("F");
		u.setUser_email("kavya@gamil");
		u.setUser_pass("1234@");
		
		
		GenericDao dao = new GenericDao();
		dao.save(u);
	}
}
