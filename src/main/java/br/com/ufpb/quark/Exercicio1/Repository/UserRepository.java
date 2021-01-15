package br.com.ufpb.quark.Exercicio1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufpb.quark.Exercicio1.Entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
