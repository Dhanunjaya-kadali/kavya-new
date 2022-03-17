package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_seat_mapping")
public class seat_mapping {
	@Id
	@GeneratedValue
	
	private int tseat_id;
	private int seat_no;
	private int schedule_id;
	

}
