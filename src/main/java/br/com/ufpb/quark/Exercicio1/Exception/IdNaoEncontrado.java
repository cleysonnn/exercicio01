package br.com.ufpb.quark.Exercicio1.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class IdNaoEncontrado extends RuntimeException {
	public IdNaoEncontrado (String mensagem){
		super(mensagem);	
		}
}
