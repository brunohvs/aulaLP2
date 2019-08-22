package br.com.hospitalif.conection;

public class Patient extends Person{
	private int idPatient;
	private PersonalEnfermity sickness;
	private Entrance history;
	public int getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}
	public PersonalEnfermity getSickness() {
		return sickness;
	}
	public void setSickness(PersonalEnfermity sickness) {
		this.sickness = sickness;
	}
	public Entrance getHistory() {
		return history;
	}
	public void setHistory(Entrance history) {
		this.history = history;
	}
	
}
