package com.example.demo.ws;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Produit;
import com.example.demo.service.ProduitService;

@RestController

@RequestMapping("stock-api/produit")

public class ProduitWs {
	@Autowired
	private ProduitService ptService;
	
	/**
	 * @param ref
	 * @return
	 * @see projet.s6.ikram.service.ProduitService#deleteByRef(java.lang.String)
	 */
	
	

	@GetMapping("/leprixdachat/{prixachat}")
	
	public List<Produit> findByPrixachat(double prixachat) {
		return ptService.findByPrixachat(prixachat);
	}
	
	@GetMapping("/leprixdachat/{prixvente}")

	public List<Produit> findByPrixvente(double prixvente) {
		return ptService.findByPrixvente(prixvente);
	}
	
	@PostMapping("/")

	public int save(Produit pt) {
		return ptService.save(pt);
	}
	
	@GetMapping("/")

	public List<Produit> findAll() {
		return ptService.findAll();
	}
	@GetMapping("/identifiant/{id}")
	public Optional<Produit> findById(Long id) {
		return ptService.findById(id);
	}
    @DeleteMapping("/reference/{ref}")
    public int deleteByRef(String ref) {
		return ptService.deleteByRef(ref);
	}

	@GetMapping("/reference/{ref}")

	public Produit findByRef(String ref) {
		return ptService.findByRef(ref);
	}
	
	
}
