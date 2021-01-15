package br.com.ufpb.quark.Exercicio1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufpb.quark.Exercicio1.Entity.Seller;
import br.com.ufpb.quark.Exercicio1.Repository.SellerRepository;

@Service
public class SellerService {

	
	@Autowired
	private SellerRepository sellerRes;
	
	
	public Seller adicionarSeller(Seller newSeller) {
		return sellerRes.save(newSeller);
		
	}
	
	public List<Seller> getSeller(){
		return sellerRes.findAll();
	}
	
	public Optional<Seller> getSellerById(long id){
		return sellerRes.findById(id);
	}
	
	
	
}
