package com.example.demo.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CommandeProduit {
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String refCommande;
	private String refProduit;
	private double qte;
	private double qteLivree;
	private double prix;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRefCommande() {
		return refCommande;
	}
	public void setRefCommande(String refCommande) {
		this.refCommande = refCommande;
	}
	public String getRefProduit() {
		return refProduit;
	}
	public void setRefProduit(String refProduit) {
		this.refProduit = refProduit;
	}
	public double getQte() {
		return qte;
	}
	public void setQte(double qte) {
		this.qte = qte;
	}
	public double getQteLivree() {
		return qteLivree;
	}
	public void setQteLivree(double qteLivree) {
		this.qteLivree = qteLivree;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	

}

