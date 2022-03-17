package com.project.entity;

import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_flightschedule")
public class FlightSchedule {
	@Id
	@GeneratedValue
	private int schedule_id;
	
	private LocalDate scheduleDate;
	private Time schedule_time;
	private int seats_avail;
	private String flight_no;
	
	

}
