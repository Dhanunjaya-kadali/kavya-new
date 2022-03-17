package com.project.entity;

import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_booking")
public class Booking {
	
	@Id
	@GeneratedValue
	private int booking_id;
	private double booking_amount;
	private int schedule_id;
	private int flight_no;
	private int id;
	
}
