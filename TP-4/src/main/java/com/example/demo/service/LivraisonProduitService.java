package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.LivraisonProduit;
import com.example.demo.dao.LivraisonProduitDao;
import com.example.demo.dao.LivraisonDao;

@Service
public class LivraisonProduitService {
	@Autowired
	private LivraisonProduitService lvpd;

	public Optional<LivraisonProduit> findById(Long id) {
		return lvpd.findById(id);
	}

	public List<LivraisonProduit> findAll() {
		return lvpd.findAll();
	}

	public void deleteById(Long id) {
		lvpd.deleteById(id);
	}
	public int save(LivraisonProduit lvp) {
		if (lvp.getQte()<5) {
		return -1;}
		else {lvpd.save(lvp); return 1; }
		
	}
}

