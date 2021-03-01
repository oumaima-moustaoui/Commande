package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Commande;
@Repository
public interface CommandeDao extends JpaRepository<Commande, Long>{
	Commande findByRef(String ref);
	List<Commande>findByTotal(double total);

	List<Commande>findByAnnee(int annee);
	
	int deleteByRef(String ref);
}
