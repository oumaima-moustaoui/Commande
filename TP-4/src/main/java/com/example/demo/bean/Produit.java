package com.example.demo.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Produit {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ref;
	private double prixachat;
	private double prixvente;
	private double seuilAlert;
	
	
	public double getSeuilAlert() {
		return seuilAlert;
	}
	public void setSeuilAlert(double seuilAlert) {
		this.seuilAlert = seuilAlert;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public double getPrixachat() {
		return prixachat;
	}
	public void setPrixachat(double prixachat) {
		this.prixachat = prixachat;
	}
	public double getPrixvente() {
		return prixvente;
	}
	public void setPrixvente(double prixvente) {
		this.prixvente = prixvente;
	}

	

}
