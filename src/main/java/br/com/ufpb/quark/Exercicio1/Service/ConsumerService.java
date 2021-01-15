package br.com.ufpb.quark.Exercicio1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufpb.quark.Exercicio1.Entity.Consumer;
import br.com.ufpb.quark.Exercicio1.Repository.ConsumerRepository;

@Service
public class ConsumerService {

	
	@Autowired
	private ConsumerRepository consumerRes;

	
	
	
	
	@Override
	public String toString() {
		return "ConsumerService [consumerRes=" + consumerRes + "]";
	}


	public ConsumerService(ConsumerRepository consumerRes) {
		super();
		this.consumerRes = consumerRes;
	}


	public ConsumerService() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Consumer adicionaConsumer(Consumer consumer) {
		return consumerRes.save(consumer);
		
	}
	
	
	public List<Consumer> getallConsumer(){
		return consumerRes.findAll();
	}
	
	
	public Optional<Consumer> getById(long id){
		return consumerRes.findById(id);
	}
	
	
	
	
	
}
