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

import br.com.ufpb.quark.Exercicio1.Entity.Consumer;
import br.com.ufpb.quark.Exercicio1.Service.ConsumerService;

@RestController
public class ConsumerController {
	
	
	@Autowired
	private ConsumerService consumeServe;
	
	
	
	public ConsumerController(ConsumerService consumeServe) {
		super();
		this.consumeServe = consumeServe;
	}

	public ConsumerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@PostMapping("/consumer")
	public ResponseEntity<?> adicionaconsumer(@RequestBody Consumer consumer){
		return ResponseEntity.status(HttpStatus.CREATED).body(consumeServe.adicionaConsumer(consumer));
		
	}
	
	@GetMapping("/consumerALL")
	public ResponseEntity<?> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(consumeServe.getallConsumer());
	}
	
	
	@GetMapping("/consumer/{id}")
	public ResponseEntity<?> getByid(@PathVariable long id){
		Optional<Consumer> consumer = consumeServe.getById(id);
		if (consumer.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(consumer.get());
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("error nao exitente !!!");
	}
	

	
}
