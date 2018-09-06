package edu.ap.spring.jpa;


public class Persoon {

	private String voornaam;
	private String achternaam;

	public Persoon(String voornaam, String achternaam) {
		this.voornaam = voornaam;
		this.achternaam = achternaam;
	}
	
	public String getVoornaam() {
		return voornaam;
	}
	
	public String getAchternaam() {
		return achternaam;
	}
	
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

}
