package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.CommandeProduit;
import com.example.demo.dao.CommandeProduitDao;

@Service
public class CommandeProduitService {
	@Autowired
	private CommandeProduitDao cmdPrtDao;

	public int deleteByRefCommande(String refCommande) {
		return cmdPrtDao.deleteByRefCommande(refCommande);
	}

	public int deleteByRefProduit(String refProduit) {
		return cmdPrtDao.deleteByRefProduit(refProduit);
	}

	public CommandeProduit findByRefCommande(String refCommande) {
		return cmdPrtDao.findByRefCommande(refCommande);
	}

	public CommandeProduit findByRefProduit(String refProduit) {
		return cmdPrtDao.findByRefProduit(refProduit);
	}

	public List<CommandeProduit> findByQte(double qte) {
		return cmdPrtDao.findByQte(qte);
	}

	public List<CommandeProduit> findByQteLivree(double qteLivree) {
		return cmdPrtDao.findByQteLivree(qteLivree);
	}

	public List<CommandeProduit> findByPrix(double prix) {
		return cmdPrtDao.findByPrix(prix);
	}

	public int save(CommandeProduit cmdPrt) {
		if(findByRefCommande(cmdPrt.getRefCommande())!=null) {
			return -1;
		}
		else if (findByRefProduit(cmdPrt.getRefProduit())!=null) {
			return -2;
		}
		else if(findByQte(cmdPrt.getQte())==null) {
			return -3;
		}
		else if (cmdPrt.getQte()<cmdPrt.getQteLivree()) {
			return -4;
		}
		else {
			cmdPrtDao.save(cmdPrt);
			return 1;
		}
	}

	public List<CommandeProduit> findAll() {
		return cmdPrtDao.findAll();
	}

	public Optional<CommandeProduit> findById(Long id) {
		return cmdPrtDao.findById(id);
	}

	
	

}
