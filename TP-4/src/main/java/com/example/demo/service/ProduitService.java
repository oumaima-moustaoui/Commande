package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProduitDao;
import com.example.demo.bean.Produit;

@Service

public class ProduitService {
	@Autowired 
	private ProduitDao ptdao;

	/**
	 * @param ref
	 * @return
	 * @see projet.s6.ikram.Dao.ProduitDao#deleteByRef(java.lang.String)
	 */
	public int deleteByRef(String ref) {
		return ptdao.deleteByRef(ref);
	}

	public Produit findByRef(String ref) {
		return ptdao.findByRef(ref);
	}

	public List<Produit> findByPrixachat(double prixachat) {
		return ptdao.findByPrixachat(prixachat);
	}

	public List<Produit> findByPrixvente(double prixvente) {
		return ptdao.findByPrixvente(prixvente);
	}

	public int save(Produit pt) {
		if (findByRef(pt.getRef())!=null) {
			return -1;
		}
		else if(pt.getPrixachat()>pt.getPrixvente() || pt.getSeuilAlert()<50) {
			return -2;
		}
		else {
			ptdao.save(pt);
			return 1;
		}
	}

	public List<Produit> findAll() {
		return ptdao.findAll();
	}

	public Optional<Produit> findById(Long id) {
		return ptdao.findById(id);
	}
	

}

