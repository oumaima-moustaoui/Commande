package com.example.demo.ws;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.CommandeProduit;
import com.example.demo.service.CommandeProduitService;

@RestController
@RequestMapping
public class CommandeProduitWs {
	@Autowired
	private CommandeProduitService cmdPrtService;
	@DeleteMapping("/refCommande/{refCommande}")
    public int deleteByRefCommande(String refCommande) {
		return cmdPrtService.deleteByRefCommande(refCommande);
	}
	@DeleteMapping("/refProduit/{refProduit}")
	public int deleteByRefProduit(String refProduit) {
		return cmdPrtService.deleteByRefProduit(refProduit);
	}
	@GetMapping("/reference/{refCommande}")
	public CommandeProduit findByRefCommande(String refCommande) {
		return cmdPrtService.findByRefCommande(refCommande);
	}
    @GetMapping("/reference/{refProduit}")
	public CommandeProduit findByRefProduit(String refProduit) {
		return cmdPrtService.findByRefProduit(refProduit);
	}
    @GetMapping("/quantite/{qte}")
	public List<CommandeProduit> findByQte(double qte) {
		return cmdPrtService.findByQte(qte);
	}
    @GetMapping("/quantite livree/{qteLivree}")
	public List<CommandeProduit> findByQteLivree(double qteLivree) {
		return cmdPrtService.findByQteLivree(qteLivree);
	}
    @GetMapping("/prix/{prix}")
	public List<CommandeProduit> findByPrix(double prix) {
		return cmdPrtService.findByPrix(prix);
	}
    @PostMapping("/")
	public int save(CommandeProduit cmdPrt) {
		return cmdPrtService.save(cmdPrt);
	}
    @GetMapping("/")
	public List<CommandeProduit> findAll() {
		return cmdPrtService.findAll();
	}
    @GetMapping("/identifiant/{id}")
	public Optional<CommandeProduit> findById(Long id) {
		return cmdPrtService.findById(id);
	}
    
	

}
