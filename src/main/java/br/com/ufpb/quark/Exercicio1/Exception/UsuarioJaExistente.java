package br.com.ufpb.quark.Exercicio1.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioJaExistente extends RuntimeException{
	public  UsuarioJaExistente(String S) {
		super(S);
	}
	

}
