package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_admin")
public class admin {
	
	@Id
	@GeneratedValue
	private int admin_id;
	private String admin_email;
	private String admin_pass;
	private int flight_no;
	
	
	
	
	

}
