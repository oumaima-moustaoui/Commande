package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class LivraisonProduit {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String refp;
private double qte;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getRefp() {
	return refp;
}
public void setRefp(String refp) {
	this.refp = refp;
}
public double getQte() {
	return qte;
}
public void setQte(double qte) {
	this.qte = qte;
}
}

