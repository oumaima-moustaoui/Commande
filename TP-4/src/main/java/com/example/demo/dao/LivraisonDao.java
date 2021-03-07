package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Livraison;

@Repository
public interface LivraisonDao extends JpaRepository<Livraison, Long>{
Livraison findByRef(String ref);
}

