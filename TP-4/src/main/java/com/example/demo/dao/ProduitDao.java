package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Produit;

@Repository

public interface ProduitDao extends JpaRepository<Produit, Long> {
	Produit findByRef(String ref);
	List<Produit>findByPrixachat(double prixachat);
	List<Produit>findByPrixvente(double prixvente);
	@Transactional
    int deleteByRef(String ref);
}


