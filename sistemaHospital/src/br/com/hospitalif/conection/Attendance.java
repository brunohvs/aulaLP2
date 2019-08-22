package br.com.hospitalif.conection;

import java.util.Date;

public class Attendance {
	private int attendanceId;
	private String enfermaryComment;
	private String doctorComment;
	private float height;
	private float weight;
	private Date date;
	private Enfermity sickness;
	public int getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}
	public String getEnfermaryComment() {
		return enfermaryComment;
	}
	public void setEnfermaryComment(String enfermaryComment) {
		this.enfermaryComment = enfermaryComment;
	}
	public String getDoctorComment() {
		return doctorComment;
	}
	public void setDoctorComment(String doctorComment) {
		this.doctorComment = doctorComment;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Enfermity getSickness() {
		return sickness;
	}
	public void setSickness(Enfermity sickness) {
		this.sickness = sickness;
	}
	
}
