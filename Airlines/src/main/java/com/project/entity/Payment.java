package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_payment")
public class Payment {
	
	@Id
	@GeneratedValue
	private int payment_id;
	private int booking_id;
	private double payment_amount;
	

}
