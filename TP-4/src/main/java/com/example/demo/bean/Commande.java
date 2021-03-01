package com.example.demo.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Commande {
@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ref;
	private int annee;
	private double total;
	private double totalPaiementCheque;
	private double totalPaiementEspece;
	
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
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getTotalPaiementCheque() {
		return totalPaiementCheque;
	}
	public void setTotalPaiementCheque(double totalPaiementCheque) {
		this.totalPaiementCheque = totalPaiementCheque;
	}
	public double getTotalPaiementEspece() {
		return totalPaiementEspece;
	}
	public void setTotalPaiementEspece(double totalPaiementEspece) {
		this.totalPaiementEspece = totalPaiementEspece;
	}

	
}
