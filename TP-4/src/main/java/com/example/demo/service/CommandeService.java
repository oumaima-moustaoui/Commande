package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Commande;
import com.example.demo.dao.CommandeDao;

@Service
public class CommandeService {
@Autowired
private CommandeDao commandeDao;

public Commande findByRef(String ref) {
	return commandeDao.findByRef(ref);
}

public List<Commande> findByTotal(double total) {
	return commandeDao.findByTotal(total);
}


public List<Commande> findByAnnee(int annee) {
	return commandeDao.findByAnnee(annee);
}

public int save(Commande commande) {
	if (findByRef(commande.getRef()) != null) {
		return -1;
	} else if (commande.getTotal() < commande.getTotalPaiementCheque()) {
		return -2;
	} else if (commande.getTotal() < commande.getTotalPaiementEspece())
	{
		return -3;
	}
	else if(commande.getTotal() < (commande.getTotalPaiementCheque()+commande.getTotalPaiementEspece())) {
		return -4;
	}
	else {
		commandeDao.save(commande);
		return 1;
       }
}
public List<Commande> findAll() {
	return commandeDao.findAll();
}

public Optional<Commande> findById(Long id) {
	return commandeDao.findById(id);
}

public int deleteByRef(String ref) {
	return commandeDao.deleteByRef(ref);
}

	
}
