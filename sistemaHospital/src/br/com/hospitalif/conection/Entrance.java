package br.com.hospitalif.conection;

import java.util.Date;

public class Entrance {
	private int idEntrance;
	private Date checkIn;
	private Date checkOut;
	private String status;
	private Attendance patientStatus;
	public int getIdEntrance() {
		return idEntrance;
	}
	public void setIdEntrance(int idEntrance) {
		this.idEntrance = idEntrance;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Attendance getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(Attendance patientStatus) {
		this.patientStatus = patientStatus;
	}
	
}
