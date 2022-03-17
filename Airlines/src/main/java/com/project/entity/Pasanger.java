package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_pasanger")
public class Pasanger {
	
	@Id
	@GeneratedValue
	private int passanger_id;
	private String paasanger_name;
	private int booking_id;
	

}
