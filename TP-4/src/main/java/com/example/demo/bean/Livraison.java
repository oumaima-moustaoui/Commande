package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livraison {
@Id @GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String ref;
private String refcom;
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
public String getRefcom() {
	return refcom;
}
public void setRefcom(String refcom) {
	this.refcom = refcom;
}

}

