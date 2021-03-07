package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Livraison;
import com.example.demo.bean.LivraisonProduit;

@Repository

public interface LivraisonProduitDao extends JpaRepository<LivraisonProduit, Long> {
	Optional<LivraisonProduit> findById(Long id);
}
