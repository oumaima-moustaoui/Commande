package com.example.demo.ws;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Livraison;
import com.example.demo.service.LivraisonService;

@RestController
@RequestMapping("stock/Livraison")
public class LivraisonWs {
@Autowired
private LivraisonService lvs;
@GetMapping("/reference/{ref}")
public Livraison findByRef(String ref) {
	return lvs.findByRef(ref);
}
@PostMapping("/")
public int save(Livraison lv) {
	return lvs.save(lv);
}
@GetMapping("/")
public List<Livraison> findAll() {
	return lvs.findAll();
}
@GetMapping("/identifiant/{id}")
public Optional<Livraison> findById(Long id) {
	return lvs.findById(id);
}
@DeleteMapping("/identifiant/{id}")
public void deleteById(Long id) {
	lvs.deleteById(id);
}

}
