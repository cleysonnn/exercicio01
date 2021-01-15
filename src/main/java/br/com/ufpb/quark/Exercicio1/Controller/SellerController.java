package br.com.ufpb.quark.Exercicio1.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufpb.quark.Exercicio1.Entity.Seller;
import br.com.ufpb.quark.Exercicio1.Service.SellerService;

@RestController
public class SellerController {

	@Autowired
	private SellerService sellerServe;
	
	@PostMapping("/Seller")
	public ResponseEntity<?> adicionaSeller(@RequestBody Seller newSeller){
		return ResponseEntity.status(HttpStatus.CREATED).body(sellerServe.adicionarSeller(newSeller));
	}
	
	@GetMapping("/SellerALL")
	public ResponseEntity<?> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(sellerServe.getSeller());
	}
	
	
	@GetMapping("/Seller/{id}")
	public ResponseEntity<?> getByid(@PathVariable long id){
		Optional<Seller> seller = sellerServe.getSellerById(id);
		if (seller.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(seller.get());
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("error nao exitente !!!");
	}
	
	
}
