package com.example.demo.ws;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.LivraisonProduit;
import com.example.demo.service.LivraisonProduitService;

@RestController
@RequestMapping
public class LivraisonProduitWs {
@Autowired
private LivraisonProduitService lvps;
@GetMapping("/identifiant/{id}")
public Optional<LivraisonProduit> findById(Long id) {
	return lvps.findById(id);
}
@GetMapping("/")
public List<LivraisonProduit> findAll() {
	return lvps.findAll();
}
@DeleteMapping("/identifiant/{id}")
public void deleteById(Long id) {
	lvps.deleteById(id);
}
@PostMapping("/")
public int save(LivraisonProduit lvp) {
	return lvps.save(lvp);
}

}
