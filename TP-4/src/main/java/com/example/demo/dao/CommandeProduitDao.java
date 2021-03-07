package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.CommandeProduit;
@Repository
public interface CommandeProduitDao extends JpaRepository<CommandeProduit, Long> {
	CommandeProduit findByRefCommande(String refCommande);
	CommandeProduit findByRefProduit(String refProduit);
	List<CommandeProduit> findByQte(double qte);
	List<CommandeProduit> findByQteLivree(double qteLivree);
	List<CommandeProduit> findByPrix(double prix);
	@Transactional
	int deleteByRefCommande(String refCommande);
	@Transactional
	int deleteByRefProduit(String refProduit);
}
