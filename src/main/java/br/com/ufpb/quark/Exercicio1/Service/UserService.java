package br.com.ufpb.quark.Exercicio1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufpb.quark.Exercicio1.Entity.User;
import br.com.ufpb.quark.Exercicio1.Exception.IdNaoEncontrado;
import br.com.ufpb.quark.Exercicio1.Exception.UsuarioJaExistente;
import br.com.ufpb.quark.Exercicio1.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRes;

	public User adicionaUsuario(User newUser) throws UsuarioJaExistente {
		return userRes.save(newUser);

	}

	public List<User> getUser() {
		return userRes.findAll();
	}

	public Optional<User> getByid(long id) throws IdNaoEncontrado {
		if (userRes == null) {
			throw new IdNaoEncontrado("id nao foi encontrado");

		}
		return userRes.findById(id);
	}

}
