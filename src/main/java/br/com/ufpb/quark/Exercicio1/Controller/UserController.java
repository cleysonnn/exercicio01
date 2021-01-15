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

import br.com.ufpb.quark.Exercicio1.Entity.User;
import br.com.ufpb.quark.Exercicio1.Exception.IdNaoEncontrado;
import br.com.ufpb.quark.Exercicio1.Exception.UsuarioJaExistente;
import br.com.ufpb.quark.Exercicio1.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userServe;
	
	
	@PostMapping("/user")
	public ResponseEntity<?> adicionaUser(@RequestBody User user) {
		try {
		return ResponseEntity.status(HttpStatus.CREATED).body(userServe.adicionaUsuario(user));
//		return ResponseEntity.status(HttpStatus.OK).body(userServe.adicionaUsuario(user));
		}catch (UsuarioJaExistente error) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("CPF ou Email ja existente");
		}
	}
	
	@GetMapping("/user")
	public ResponseEntity<?> getAll(){
		try {
		return ResponseEntity.status(HttpStatus.OK).body(userServe.getUser()) ;
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getById(@PathVariable long id){
		Optional<User> user = userServe.getByid(id);
		try {
			return ResponseEntity.status(HttpStatus.OK).body(user.get());
		}catch (IdNaoEncontrado e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage()	);
		}
	}
	
	
}
