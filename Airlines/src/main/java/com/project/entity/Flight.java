package com.project.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_flight")
public class Flight {
	
	@Id
	@GeneratedValue
	private int flight_no;
	private String carrier;
	private String source;
	private String destination;
	private LocalDate depar_time;
	private LocalDate arrival_time;
	private int total_seats;
	
	@OneToMany(mappedBy = "flight")
	private List<User> users;

	public int getFlight_no() {
		return flight_no;
	}

	public void setFlight_no(int flight_no) {
		this.flight_no = flight_no;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getDepar_time() {
		return depar_time;
	}

	public void setDepar_time(LocalDate depar_time) {
		this.depar_time = depar_time;
	}

	public LocalDate getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(LocalDate arrival_time) {
		this.arrival_time = arrival_time;
	}

	public int getTotal_seats() {
		return total_seats;
	}

	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}

	public List<User> getUser() {
		return users;
	}

	public void setUser(List<User> user) {
		this.users = user;
	}
	
	
	
//	@OneToMany(mappedBy = "album")
//	private List<Song> songs;
//
//	@ManyToOne
//	@JoinColumn(name="album_id")
//	private Album album;

}
