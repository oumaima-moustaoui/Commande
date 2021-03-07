package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Livraison;
import com.example.demo.dao.LivraisonDao;

@Service
public class LivraisonService {
@Autowired
private LivraisonDao lvd;

public Livraison findByRef(String ref) {
	return lvd.findByRef(ref);
}

public int save(Livraison lv) {
	
	if(findByRef(lv.getRef())!=null) {return -1;}
	else {lvd.save(lv); return 1;}

}

public List<Livraison> findAll() {
	return lvd.findAll();
}

public Optional<Livraison> findById(Long id) {
	return lvd.findById(id);
}

public void deleteById(Long id) {
	lvd.deleteById(id);
}
}

