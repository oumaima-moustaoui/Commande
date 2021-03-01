package com.example.demo.ws;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Commande;
import com.example.demo.service.CommandeService;

@RestController
@RequestMapping
public class CommandeWs {
@Autowired
private CommandeService commandeService;
@GetMapping("/reference/{ref}")
public Commande findByRef(String ref) {
	return commandeService.findByRef(ref);
}
@GetMapping("/total/{total}")
public List<Commande> findByTotal(double total) {
	return commandeService.findByTotal(total);
}

@GetMapping("/annee/{annee}")
public List<Commande> findByAnnee(int annee) {
	return commandeService.findByAnnee(annee);
}
@PostMapping("/")
public int save(@RequestBody Commande commande) {
	return commandeService.save(commande);
}
@GetMapping("/")
public List<Commande> findAll() {
	return commandeService.findAll();
}
@GetMapping("/id/{id}")
public Optional<Commande> findById(Long id) {
	return commandeService.findById(id);
}
@DeleteMapping("/ref/{ref}")
public void deleteByRef(@PathVariable String ref) {
	commandeService.deleteByRef(ref);
}


}
